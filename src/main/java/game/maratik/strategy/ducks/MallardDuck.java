package game.maratik.strategy.ducks;

import game.maratik.strategy.behavior.FlyWithWings;
import game.maratik.strategy.behavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
