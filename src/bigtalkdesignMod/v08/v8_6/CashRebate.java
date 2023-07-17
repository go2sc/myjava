package bigtalkdesignMod.v08.v8_6;

public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double price, int num) {
        double result = price * num * moneyRebate;
        return super.acceptCash(result, 1);
    }

}
