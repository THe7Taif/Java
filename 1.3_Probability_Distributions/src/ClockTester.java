

public class ClockTester {
    public static void main(String[] args) {

        // Get the singleton instance of Clock
        Clock clock = Clock.getInstance();


        // Print initial time
        System.out.println("Initial Time: " + clock.getTime());

        // Setting the time to 10.0
        clock.setTime(10.0);
        System.out.println("After setTime(10.0): " + clock.getTime());


        // Setting Advance time by 5.5
        clock.setAdvanceTime(5.5);
        System.out.println("After advanceTime(5.5): " + clock.getTime());




        // Getting another reference to the same Clock instance
        Clock clock2 = Clock.getInstance();
        System.out.println("Another reference time: " + clock2.getTime());

        // Setting Advance time from anotherClock (should affect same object)
        clock2.setAdvanceTime(2.0);
        System.out.println("Time after anotherClock.advanceTime(2.0): " + clock.getTime());

    }
}
