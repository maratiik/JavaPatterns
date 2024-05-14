package game.maratik.decorator;

import game.maratik.decorator.beverages.Beverage;
import game.maratik.decorator.beverages.DarkBlend;
import game.maratik.decorator.beverages.DeCaf;
import game.maratik.decorator.beverages.Espresso;
import game.maratik.decorator.condiments.Chocolate;
import game.maratik.decorator.condiments.Mocha;
import game.maratik.decorator.condiments.Soy;
import game.maratik.decorator.condiments.Whip;

public class DecoratorTest {
    public static void main(String[] args) {
        Beverage bev1 = new Espresso();
        System.out.println(bev1.getDescription() + ", $" + bev1.cost());
        System.out.println();

        Beverage bev2 = new DarkBlend();
        bev2 = new Mocha(bev2);
        bev2 = new Soy(bev2);
        bev2 = new Whip(bev2);
        System.out.println(bev2.getDescription() + ", $" + bev2.cost());
        System.out.println();

        Beverage bev3 = new DeCaf();
        bev3 = new Chocolate(bev3);
        bev3 = new Chocolate(bev3);
        bev3 = new Mocha(bev3);
        bev3 = new Whip(bev3);
        System.out.println(bev3.getDescription() + ", $" + bev3.cost());
    }
}
