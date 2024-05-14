package game.maratik.strategy.behavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Duck is flying with a rocket");
    }
}
