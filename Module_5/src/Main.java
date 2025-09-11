/*
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Thread: " + i);
            }
        }
    }
}
class B extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Thread: " + i);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            A objOdd = new A();
            B objEven = new B();

            objEven.start();    // start() method is used to start the thread by calling the run() method
            objEven.join();     // join() method is used to wait for a thread to die. In other words, it makes the current thread to pause execution until the thread it joins with completes its execution.

            objOdd.start();
            objOdd.join();

            System.out.println("Printing complete.");

        } catch(Exception e){
            System.out.println(e);
        }

    }
}
*/

// Version_2: Advance code with fewer classes and same output, Runnable interface.
public class Main {
    public static void main(String[] args) {
        try {

            Runnable objOdd = () -> {
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 != 0) {
                        System.out.println("Odd Thread: " + i);
                    }
                }
            };

            Runnable objEven = () -> {
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 == 0) {
                        System.out.println("Even Thread: " + i);
                    }
                }
            };


            Thread threadEven = new Thread(objEven);
            threadEven.start();    // start() method is used to start the thread by calling the run() method
            threadEven.join();     // join() method is used to wait for a thread to die. In other words, it makes the current thread to pause execution until the thread it joins with completes its execution.

            Thread threadOdd = new Thread(objOdd);
            threadOdd.start();
            threadOdd.join(); // wait for odd thread to finish

            System.out.println("Printing complete.");

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
