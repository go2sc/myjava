package bigtalkdesignMod.v08.v8_3;

public class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new Add();
    }

}
