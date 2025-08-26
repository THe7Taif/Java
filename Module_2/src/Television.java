public class Television {
    private int channel = 1;
    private boolean isOn = false;

    public void pressOnOff() {
        isOn = !isOn;  // if off, turnOn
    }

    public void nextChannel() {
        channel++;
        if (channel > 10) {
            channel = 1;  // will be back to th first channel, after 10
        }
    }

    public int getChannel() {
        return channel;
    }

    public boolean isOn() {
        return isOn;
    }
}
