public class Television {
    private int channel = 1;
    private boolean isOn = false;

    public void pressOnOff() {
        isOn = !isOn;  // إذا طافي يشغل، وإذا شغال يطفي
    }

    public void nextChannel() {
        channel++;
        if (channel > 10) {
            channel = 1;  // نرجع للقناة 1 إذا تجاوزنا 10
        }
    }

    public int getChannel() {
        return channel;
    }

    public boolean isOn() {
        return isOn;
    }
}
