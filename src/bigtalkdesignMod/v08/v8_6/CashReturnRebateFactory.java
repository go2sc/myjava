package bigtalkdesignMod.v08.v8_6;

public class CashReturnRebateFactory implements IFactory {
    private double moneyRebate = 1d;
    private double moneyCondition = 0d;
    private double moneyReturn = 0d;

    public CashReturnRebateFactory(double moneyRebate, double moneyCondition, double moneyReturn) {
        this.moneyRebate = moneyRebate;
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public ISale createSalesModel() {
        CashNormal cn2 = new CashNormal();
        CashRebate cr3 = new CashRebate(this.moneyRebate);
        CashReturn cr4 = new CashReturn(this.moneyCondition, this.moneyReturn);

        cr3.decorate(cn2);
        cr4.decorate(cr3);

        return cr4;
    }

}
