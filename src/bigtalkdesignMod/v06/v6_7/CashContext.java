package bigtalkdesignMod.v06.v6_7;

public class CashContext {

    private ISale cs;

    public CashContext(int cashType) {
        switch (cashType) {
            case 1:
                this.cs = new CashNormal();
                break;
            case 2:
                this.cs = new CashRebate(0.8d);
                break;
            case 3:
                this.cs = new CashRebate(0.7d);
                break;
            case 4:
                this.cs = new CashReturn(300d, 100d);
                break;
            case 5:
                // 先打8折，再满减
                CashNormal cn = new CashNormal();
                CashReturn cr1 = new CashReturn(300d, 100d);
                CashRebate cr2 = new CashRebate(0.8d);

                cr1.decorate(cn);
                cr2.decorate(cr1);
                this.cs = cr2;

                break;
            case 6:
                // 先满减，再打折
                CashNormal cn2 = new CashNormal();
                CashRebate cr3 = new CashRebate(0.7d);
                CashReturn cr4 = new CashReturn(200d, 50d);

                cr3.decorate(cn2);
                cr4.decorate(cr3);
                this.cs = cr4;
                break;
        }
    }

    public double getResult(double price, int num) {
        return this.cs.acceptCash(price, num);
    }
}
