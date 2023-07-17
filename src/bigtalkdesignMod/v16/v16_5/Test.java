package bigtalkdesignMod.v16.v16_5;

public class Test {
    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());

        c.request();
        c.request();
        c.request();
        c.request();
    }

}
