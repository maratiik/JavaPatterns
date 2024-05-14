package game.maratik.factory.abstract_factory;

import game.maratik.factory.abstract_factory.pizzeria.ChicagoPizzaStore;
import game.maratik.factory.abstract_factory.pizzeria.NYPizzaStore;
import game.maratik.factory.abstract_factory.pizzeria.PizzaStore;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        nyStore.orderPizza("cheese");
        System.out.println();

        chicagoStore.orderPizza("clam");
    }
}
