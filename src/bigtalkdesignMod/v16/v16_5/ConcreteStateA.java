package bigtalkdesignMod.v16.v16_5;

public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        // TODO Auto-generated method stub
        context.setState(new ConcreteStateB());
    }

}
