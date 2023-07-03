package bigtalkdesignMod.v01.v1_10;

import bigtalkdesignMod.v01.v1_9.Add;
import bigtalkdesignMod.v01.v1_9.Div;
import bigtalkdesignMod.v01.v1_9.Mul;
import bigtalkdesignMod.v01.v1_9.Operation;
import bigtalkdesignMod.v01.v1_9.Sub;

public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation oper = null;
        switch (operate) {
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
