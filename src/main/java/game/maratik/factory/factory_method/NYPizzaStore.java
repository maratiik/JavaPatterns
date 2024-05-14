package game.maratik.factory.factory_method;

public class NYPizzaStore extends PizzaStore {
    // Factory method
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NyStyleCheesePizza();
            case "veggie" -> new NyStyleVeggiePizza();
            case "pepperoni" -> new NyStylePepperoniPizza();
            default -> null;
        };
    }
}
