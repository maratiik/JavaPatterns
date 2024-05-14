package game.maratik.strategy;

import game.maratik.strategy.behavior.FlyRocketPowered;
import game.maratik.strategy.ducks.Duck;
import game.maratik.strategy.ducks.MallardDuck;
import game.maratik.strategy.ducks.ModelDuck;
import game.maratik.strategy.ducks.RubberDuck;

public class BehaviourEncapsulationTest {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
        System.out.println();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();
        rubber.swim();
        System.out.println();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        System.out.println();
    }
}
