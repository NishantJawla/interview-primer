package condiments;

import berverages.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "Mocha " + beverage.getDescription();
    }

    @Override
    public double getPrice() {
        return 1.00 + beverage.getPrice();
    }
}
