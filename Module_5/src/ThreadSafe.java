// Task 2: 5.2_Synchronization Thread-safe

import java.util.ArrayList;
import java.util.List;

public class ThreadSafe {

    ArrayList <String> list = new ArrayList();


    public synchronized void addToList(String value) {
        list.add(value);
    }
    public synchronized String getFromList(int index) {
        return (String) list.get(index);
    }

    public  synchronized void removeFromList(int index) {
        list.remove(index);
    }


    public class TestThreadSafe {
        public static void main(String[] args) {
            ThreadSafe list = new ThreadSafe();

            // Thread 1: adds elements to the list
            Thread adder = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    String value = "Item " + i;
                    list.addToList(value);
                    System.out.println("Added: " + value);
                    try { Thread.sleep(100); } catch (InterruptedException e) {}
                }
            });

            // Thread 2: reads elements from the list
            Thread getter = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    try {
                        String value = list.getFromList(i);
                        System.out.println("Read: " + value);
                    } catch (Exception e) {
                        System.out.println("Read failed at index " + i);
                    }
                    try { Thread.sleep(120); } catch (InterruptedException e) {}
                }
            });

            // Thread 3: removes elements from the list
            Thread remover = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    try {
                        list.removeFromList(0); // دايمًا يحذف أول عنصر
                        System.out.println("Removed element at index 0");
                    } catch (Exception e) {
                        System.out.println("Remove failed");
                    }
                    try { Thread.sleep(150); } catch (InterruptedException e) {}
                }
            });

            // start all threads
            adder.start();
            getter.start();
            remover.start();

            // wait for all threads to finish
            try {
                adder.join();
                getter.join();
                remover.join();
            } catch (InterruptedException e) {}
        }
    }


}


