package game.maratik.factory.abstract_factory.pizzeria;

import game.maratik.factory.abstract_factory.factories.ChicagoPizzaIngredientFactory;
import game.maratik.factory.abstract_factory.factories.PizzaIngredientFactory;
import game.maratik.factory.abstract_factory.pizzas.CheesePizza;
import game.maratik.factory.abstract_factory.pizzas.ClamPizza;
import game.maratik.factory.abstract_factory.pizzas.Pizza;
import game.maratik.factory.abstract_factory.pizzas.VeggiesPizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago style cheese pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("Chicago style vaggie pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago style clam pizza");
        }

        return pizza;
    }
}
