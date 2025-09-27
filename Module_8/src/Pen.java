public class Pen {

    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    private Color color;
    private boolean isCapOn;

    public Pen() {
        this.color = Color.RED;
        this.isCapOn = true; // default color is red, cap is on
    }

    public Pen(Color color) {
        this.color = color;
        this.isCapOn = true;
    }

    public void capOn() {
        isCapOn = true;
    }

    public void capOff() {
        isCapOn = false;
    }


    public String draw() {
        if (isCapOn) {
            return "";  // cannot draw if cap is on
        }
        return "Drawing " + color.toString();
    }

    public void changeColor(Color newColor) {
        if (isCapOn)
            this.color = newColor;
    }

}