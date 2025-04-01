package berverages;

public class HouseBlend implements Beverage {

    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double getPrice() {
        return 1.00;
    }
}
