package bigtalkdesignMod.v28.v28_5;

public class ConcreteElementA extends Element{

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        visitor.visitConcreteElementA(this);
    }

    public void operationA() {}

}
