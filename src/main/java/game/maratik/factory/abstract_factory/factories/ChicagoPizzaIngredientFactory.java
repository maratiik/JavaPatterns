package game.maratik.factory.abstract_factory.factories;

import game.maratik.factory.abstract_factory.ingredients.*;

import java.lang.constant.PackageDesc;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Permegano();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Olives(), new Spinach(), new Eggplant()};
    }

    @Override
    public Clams createClam() {
        return new RegularClams();
    }
}
