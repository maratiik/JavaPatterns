package game.maratik.decorator.beverages;

public class DarkBlend extends Beverage {
    public DarkBlend() {
        description = "Dark Blend Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
