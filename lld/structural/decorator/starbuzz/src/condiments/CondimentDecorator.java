package condiments;

import berverages.Beverage;

public abstract class CondimentDecorator implements Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
