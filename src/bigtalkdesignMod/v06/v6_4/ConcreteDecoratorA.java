package bigtalkdesignMod.v06.v6_4;

public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void Operation() {
        // TODO Auto-generated method stub
        super.Operation();

        this.addedState = "具体装饰对象A的独有操作";
        System.out.println(this.addedState);
    }

}
