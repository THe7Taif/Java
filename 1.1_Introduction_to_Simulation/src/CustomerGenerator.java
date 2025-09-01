// OrientationTask1_5.

class CustomerGenerator {
    public static void createCustomers(int n, ServicePoint sp) {
        for (int i = 0; i < n; i++) {
            long startTime = System.currentTimeMillis();
            long endTime = startTime + (long)(Math.random() * 5000); // نخلي خدمة بين 0 - 5 ثواني
            sp.addToQueueue(new Customer(startTime, endTime));
        }
    }
}
