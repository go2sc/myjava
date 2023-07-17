package bigtalkdesignMod.v08.v8_4;

public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation oper = null;
        IFactory factory = null;
        switch (operate) {
            case "+":

            case "-":

            case "*":

            case "/":
                factory = new FactoryBasic();
                break;
            case "pow":
            case "log":
                factory = new FactoryAdvanced();
                break;
        }

        oper = factory.createOperation(operate);

        return oper;
    }
}
