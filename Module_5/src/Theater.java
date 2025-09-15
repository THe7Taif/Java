// Task 1: 5.2_Synchronization Ticket Reservation System


class Theater {
    private int availableSeats; // available seats in the theater.


    public Theater(int seats) {
        this.availableSeats = seats; // initialize available seats.
    }



    // synchronized method to ensure only one thread can execute it at a time.
    public synchronized boolean reserve(String customerName, int tickets) { // customerName is the name of the thread.
        if (tickets < availableSeats) { // check if enough seats are available.
            System.out.println("Theater.Customer" + customerName + " reserved " + tickets + " tickets.");
            availableSeats = availableSeats - tickets; // update available, take away the reserved tickets.
            return true; // reservation successful.
        } else {
            System.out.println("Theater.Customer" + customerName + " couldn't reserve " + tickets + " tickets.");
            return false; // reservation failed.
        }
    }

    public static class Customer extends Thread {
        private Theater theater; // reference to the shared Theater object.
        private int tickets; // number of tickets the customer wants to reserve.

        // constructor to initialize the thread with a name, shared Theater object, and number of tickets to reserve.
        public Customer(Theater theater, String name, int tickets) {
            super(name);            // call the constructor of Thread class to set the thread name.
            this.theater = theater; // initialize the shared Theater object.
            this.tickets = tickets; // initialize the number of tickets to reserve.
        }

        // override the run method to define the thread's behavior when started.
        public void run() {
            theater.reserve(getName(), tickets); // call the reserve method of the Theater object to attempt to reserve tickets.
        }
    }

    public static class TicketMain {
        public static void main(String[] args) {

            // create a Theater with 10 available seats.
            Theater theater = new Theater(10);

            // create multiple Theater.Customer threads trying to reserve tickets.
            Customer c1 = new Customer(theater, "Theater.Customer 1", 1);
            Customer c2 = new Customer(theater, "Theater.Customer 2", 2);
            Customer c3 = new Customer(theater, "Theater.Customer 3", 2);
            Customer c4 = new Customer(theater, "Theater.Customer 4", 3);
            Customer c5 = new Customer(theater, "Theater.Customer 5", 1);
            Customer c6 = new Customer(theater, "Theater.Customer 6", 2);
            Customer c7 = new Customer(theater, "Theater.Customer 7", 1);
            Customer c8 = new Customer(theater, "Theater.Customer 8", 1);
            Customer c9 = new Customer(theater, "Theater.Customer 9", 3);
            Customer c10 = new Customer(theater, "Theater.Customer 10", 2);
            Customer c11 = new Customer(theater, "Theater.Customer 11", 4);
            Customer c12 = new Customer(theater, "Theater.Customer 12", 3);
            Customer c13 = new Customer(theater, "Theater.Customer 13", 4);

            // start all customer threads.
            c1.start();
            c2.start();
            c3.start();
            c4.start();
            c5.start();
            c6.start();
            c7.start();
            c8.start();
            c9.start();
            c10.start();
            c11.start();
            c12.start();
            c13.start();

        }
    }
}
