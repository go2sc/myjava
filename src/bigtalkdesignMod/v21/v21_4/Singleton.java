package bigtalkdesignMod.v21.v21_4;

public class Singleton {

    private static Singleton instance;

    // 这样外部就不能 new 了
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
