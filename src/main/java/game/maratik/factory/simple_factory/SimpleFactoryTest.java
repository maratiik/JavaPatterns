package game.maratik.factory.simple_factory;

import game.maratik.factory.simple_factory.factory.SimplePizzaFactory;
import game.maratik.factory.simple_factory.store.PizzaStore;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza("pepperoni");
    }
}
