package bigtalkdesignMod.v08.v8_3;

public class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new Div();
    }

}
