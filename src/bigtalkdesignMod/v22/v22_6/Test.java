package bigtalkdesignMod.v22.v22_6;

public class Test {

    public static void main(String[] args) {
        Abstraction ab;
        ab = new RefinedAbstraction();

        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }

}
