public class CoffeeMaker {

    private boolean isOn = false;
    private String coffeeType = "normal";  // قيمة ابتدائية
    private int coffeeAmount = 10;         // قيمة ابتدائية

    public void pressPower() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setCoffeeType(String coffeeType) {
        if (isOn) {
            this.coffeeType = coffeeType;
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeAmount(int coffeeAmount) {
        if (isOn && coffeeAmount >= 10 && coffeeAmount <= 80) {
            this.coffeeAmount = coffeeAmount;
        }
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
