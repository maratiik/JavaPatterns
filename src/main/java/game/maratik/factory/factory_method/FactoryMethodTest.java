package game.maratik.factory.factory_method;

public class FactoryMethodTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
    }
}
