package game.maratik.singleton;

public class SimpleSingleton {
    private static SimpleSingleton instance;

    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }

        return instance;
    }

    // Разные потоки дожидаются своей очереди для входа в метод
    // synchronized не нужен после инициализации переменной, будет только теряться время
    // Можно еще объявлять переменную заранее.

//    public static synchronized SimpleSingleton getInstance() {
//        if (instance == null) {
//            instance = new SimpleSingleton();
//        }
//
//        return instance;
//    }

    // volatile всегда будет атомарно храниться и записываться. Даже если это 64-битные double/long
    // jvm не будет помещать ее в кэш. Ситуация, когда 10 потоков работают со своими локальными копиями, исключена

//    private volatile static SimpleSingleton uniqueInstance;
//
//    private SimpleSingleton() {}
//
//    public static SimpleSingleton getInstance() {
//        if (uniqueInstance == null) {
//            synchronized (SimpleSingleton.class) {
//                if (uniqueInstance == null) {
//                    uniqueInstance = new SimpleSingleton();
//                }
//            }
//        }
//
//        return uniqueInstance;
//    }
}
