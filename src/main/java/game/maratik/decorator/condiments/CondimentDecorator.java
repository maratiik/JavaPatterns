package game.maratik.decorator.condiments;

import game.maratik.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
