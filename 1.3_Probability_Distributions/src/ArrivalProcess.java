import java.util.Random;

class ArrivalProcess {

    private String eventType;
    private Random randomGenerator;
    private double lambda;  // rate parameter for exponential distribution

    public ArrivalProcess(String eventType, double lambda) {
        this.eventType = eventType;
        this.lambda = lambda;
        this.randomGenerator = new Random();
    }

    // this is the main func our method to make or generate the next event and add it to the event list.
    public Event generateEvent() {
        Clock clock = Clock.getInstance();                    // get the Clock Class with singleton instance. calling for clock static instance
        double interval = -Math.log(1 - randomGenerator.nextDouble()) / lambda; // sample an exponential interval to generate random number ln(1-U)/λ. here we have "U = randomGenerator" and " λ = lambda"
        double eventTime = clock.getTime() + interval;       // compute absolute event time (current + interval). both times together which is 0.0 and RandomGenerter
        clock.setTime(eventTime);                            // advance the simulation clock to the event time, after we got bith times we to setTime() by clock  from the var eventTime.
        return new Event(eventType, eventTime);              // create and return the new Event object, which is eventType and eventTime
    }

}