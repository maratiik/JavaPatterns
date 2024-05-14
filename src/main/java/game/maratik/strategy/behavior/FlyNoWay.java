package game.maratik.strategy.behavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck can't fly");
    }
}
