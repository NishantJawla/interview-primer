package condiments;

import berverages.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getPrice() {
        return 0.8 + beverage.getPrice();
    }

    @Override
    public String getDescription() {
        return "Soy " + beverage.getDescription();
    }
}
