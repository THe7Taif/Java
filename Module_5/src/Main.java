import java.util.Random;

class SumThread extends Thread {
    private int[] numbers;
    private int start;
    private int end;
    public long partialSum; // each thread stores its partial sum here

    public SumThread(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        partialSum = 0;
        for (int i = start; i < end; i++) {
            partialSum += numbers[i];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int size = 100000;
        int[] numbers = new int[size];

        // 1️⃣ create array with random numbers
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100); // أرقام من 0 إلى 99
        }

        // 2️⃣ know number of CPU cores
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available CPU cores: " + cores);

        int chunkSize = size / cores;
        SumThread[] threads = new SumThread[cores];

        // 3️⃣ create and start threads to calculate partial sums of the array in parallel.
        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = (i == cores - 1) ? size : start + chunkSize; // آخر Thread ياخذ الباقي
            threads[i] = new SumThread(numbers, start, end);
            threads[i].start();
        }

        // 4️⃣ wait for all threads to finish and combine their results.
        long totalSum = 0;
        try {
            for (int i = 0; i < cores; i++) {
                threads[i].join(); // wait for thread to finish
                totalSum += threads[i].partialSum; // add partial sum to total sum.
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5️⃣ print the total sum.
        System.out.println("Total sum: " + totalSum);
    }
}
