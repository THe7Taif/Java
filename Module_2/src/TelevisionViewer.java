import java.util.Random;

public class TelevisionViewer {
    public static void main(String[] args) {
        Television myTV = new Television();
        Random rand = new Random();


        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            if (!myTV.isOn()) {
                myTV.pressOnOff();
            }

            int numChannels = 3 + rand.nextInt(4);
            for (int i = 0; i < numChannels; i++) {
                System.out.println("Watching channel " + myTV.getChannel());
                myTV.nextChannel();
            }

            myTV.pressOnOff();
            System.out.println("Falling asleep");
        }
    }
}
