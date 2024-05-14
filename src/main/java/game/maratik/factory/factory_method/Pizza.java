package game.maratik.factory.factory_method;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Adding toppings: ");
        for (String t : toppings) {
            System.out.println("   " + t);
        }
    }

    void bake() {
        System.out.println("Baking " + name);
    }

    void cut() {
        System.out.println("Cutting " + name);
    }

    void box() {
        System.out.println("Boxing " + name);
    }

    public String getName() {
        return name;
    }
}
