package bigtalkdesignMod.v22.v22_6;

public class RefinedAbstraction extends Abstraction {
    public void operation() {
        System.out.print("具体的Abstraction");
        implementor.operation();
    }
}
