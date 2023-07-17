package bigtalkdesignMod.v08.v8_4;

public class FactoryBasic implements IFactory {

    @Override
    public Operation createOperation(String operType) {
        Operation oper = null;
        switch (operType) {
            case "+":
                oper = new Add();
                break;
            case "-":
                oper = new Sub();
                break;
            case "*":
                oper = new Mul();
                break;
            case "/":
                oper = new Div();
                break;
        }
        return oper;
    }

}
