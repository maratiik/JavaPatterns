package game.maratik.decorator.condiments;

import game.maratik.decorator.beverages.Beverage;

public class Chocolate extends CondimentDecorator {
    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
