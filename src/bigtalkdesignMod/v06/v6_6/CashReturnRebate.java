package bigtalkdesignMod.v06.v6_6;

public class CashReturnRebate extends CashSuper {
    private double moneyCondition = 0d;
    private double moneyReturn = 0d;
    private double moneyRebate = 0d;

    public CashReturnRebate(double moneyRebate, double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = price * num * this.moneyRebate;

        if (moneyCondition > 0 && result >= moneyCondition) {
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        }

        return result;
    }

}
