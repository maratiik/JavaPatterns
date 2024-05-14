package game.maratik.factory.simple_factory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Add cheese to cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("Box cheese pizza");
    }
}
