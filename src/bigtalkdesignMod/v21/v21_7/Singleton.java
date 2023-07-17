package bigtalkdesignMod.v21.v21_7;

public class Singleton {

    private static Singleton instance = new Singleton();

    // 这样外部就不能 new 了
    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}
