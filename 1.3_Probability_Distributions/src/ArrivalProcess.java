import distributions.Distributions;

class ArrivalProcess {

    private String eventType;
    private Distributions randomGenerator = new Distributions();
    private double lambda;  // rate parameter for exponential distribution

    public ArrivalProcess(String eventType, double lambda) {
        this.eventType = eventType;
        this.lambda = lambda;}

    // this is the main func our method to make or generate the next event and add it to the event list.
    public Event generateEvent() {
        Clock clock = Clock.getInstance();                    // get the Clock Class with singleton instance. calling for clock static instance
        double eventTime = clock.getTime() + randomGenerator.negexp(5.0);       // compute absolute event time (current + interval). both times together which is 0.0 and RandomGenerter
        clock.setTime(eventTime);                            // advance the simulation clock to the event time, after we got bith times we to setTime() by clock  from the var eventTime.
        return new Event(eventType, eventTime);              // create and return the new Event object, which is eventType and eventTime
    }

}







