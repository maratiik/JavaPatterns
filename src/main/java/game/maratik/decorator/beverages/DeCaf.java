package game.maratik.decorator.beverages;

public class DeCaf extends Beverage {
    public DeCaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
