package bigtalkdesignMod.v01.v1_8;

public class Operation {
    public static double getResult(double numberA, double numberB, String operate) {
        double result = 0d;

        switch (operate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;

        }

        return result;
    }

}
