package bigtalkdesignMod.v02.v2_3;

public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double price, int num) {
        return price * num * moneyRebate;
    }

}
