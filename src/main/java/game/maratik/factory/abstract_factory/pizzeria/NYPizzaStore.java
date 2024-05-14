package game.maratik.factory.abstract_factory.pizzeria;

import game.maratik.factory.abstract_factory.factories.NYPizzaIngredientFactory;
import game.maratik.factory.abstract_factory.factories.PizzaIngredientFactory;
import game.maratik.factory.abstract_factory.pizzas.CheesePizza;
import game.maratik.factory.abstract_factory.pizzas.ClamPizza;
import game.maratik.factory.abstract_factory.pizzas.Pizza;
import game.maratik.factory.abstract_factory.pizzas.VeggiesPizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY style cheese pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY style clam pizza");
        } else if (item.equals("veggies")) {
            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("NY style veggies pizza");
        }

        return pizza;
    }
}
