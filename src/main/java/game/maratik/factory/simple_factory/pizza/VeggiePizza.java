package game.maratik.factory.simple_factory.pizza;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Add veggies to pepperoni pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake pepperoni pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut pepperoni pizza");
    }

    @Override
    public void box() {
        System.out.println("Box pepperoni pizza");
    }
}
