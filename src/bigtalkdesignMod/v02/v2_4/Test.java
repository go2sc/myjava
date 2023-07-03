package bigtalkdesignMod.v02.v2_4;

public class Test {
    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }

}
