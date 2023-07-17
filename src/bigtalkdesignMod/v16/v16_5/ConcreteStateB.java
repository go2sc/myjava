package bigtalkdesignMod.v16.v16_5;

public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        // TODO Auto-generated method stub
        context.setState(new ConcreteStateA());
    }

}
