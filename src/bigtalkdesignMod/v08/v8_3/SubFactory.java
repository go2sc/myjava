package bigtalkdesignMod.v08.v8_3;

public class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new Sub();
    }

}
