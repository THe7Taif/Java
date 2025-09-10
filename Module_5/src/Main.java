
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




/*
class OddOrEven extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Thread: " + i);
            } else {
                System.out.println("Even Thread: " + i);
            }
        }
    }
}
public class Main extends Thread  {
    public static void main(String[] args) {

        OddOrEven obj = new OddOrEven();
        obj.start();


    }
}
*/

