package bigtalkdesignMod.v08.v8_3;

public class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new Mul();
    }

}
