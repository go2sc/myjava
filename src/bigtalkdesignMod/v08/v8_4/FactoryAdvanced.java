package bigtalkdesignMod.v08.v8_4;

public class FactoryAdvanced implements IFactory {

    @Override
    public Operation createOperation(String operType) {
        Operation oper = null;
        switch (operType) {
            case "pow":
                oper = new Pow();
                break;
            case "log":
                oper = new Log();
                break;
        }

        return oper;
    }

    

}
