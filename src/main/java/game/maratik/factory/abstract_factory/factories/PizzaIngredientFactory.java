package game.maratik.factory.abstract_factory.factories;

import game.maratik.factory.abstract_factory.ingredients.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Clams createClam();
}
