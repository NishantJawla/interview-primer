package berverages;

public class Espresso implements Beverage {

    @Override
    public double getPrice() {
        return 1.99;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
