package bigtalkdesignMod.v06.v6_7;

public class CashReturn extends CashSuper {
    private double moneyCondition = 0d;
    private double moneyReturn = 0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = price * num;

        if (moneyCondition > 0 && result >= moneyCondition) {
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        }

        return super.acceptCash(result, 1);
    }

}
