package bigtalkdesignMod.v06.v6_4;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void Operation() {
        // TODO Auto-generated method stub
        super.Operation();

        this.AddedBehavior();
    }

    private void AddedBehavior() {
        System.out.println("具体装饰对象B的独有操作");
    }

}
