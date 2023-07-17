package bigtalkdesignMod.v21.v21_5;

// 多线程单例
public class Test {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("两个对象是相同的实例");
        }
    }
}
