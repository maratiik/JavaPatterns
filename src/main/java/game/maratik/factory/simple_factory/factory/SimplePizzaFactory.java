package game.maratik.factory.simple_factory.factory;

import game.maratik.factory.simple_factory.pizza.CheesePizza;
import game.maratik.factory.simple_factory.pizza.PepperoniPizza;
import game.maratik.factory.simple_factory.pizza.Pizza;
import game.maratik.factory.simple_factory.pizza.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
