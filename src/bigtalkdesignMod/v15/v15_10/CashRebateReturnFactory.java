package bigtalkdesignMod.v15.v15_10;

public class CashRebateReturnFactory implements IFactory {
    private double moneyRebate = 1d;
    private double moneyCondition = 0d;
    private double moneyReturn = 0d;

    public CashRebateReturnFactory(double moneyRebate, double moneyCondition, double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public ISale createSalesModel() {
        CashNormal cn = new CashNormal();
        CashReturn cr1 = new CashReturn(this.moneyCondition, this.moneyReturn);
        CashRebate cr2 = new CashRebate(this.moneyRebate);

        cr1.decorate(cn);
        cr2.decorate(cr1);

        return cr2;
    }

}
