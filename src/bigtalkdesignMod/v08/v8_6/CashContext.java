package bigtalkdesignMod.v08.v8_6;

public class CashContext {

    private ISale cs;

    public CashContext(int cashType) {
        IFactory fs = null;

        switch (cashType) {
            case 1:
                fs = new CashRebateReturnFactory(1d, 0d, 0d);
                break;
            case 2:
                fs = new CashRebateReturnFactory(0.8d, 0d, 0d);
                break;
            case 3:
                fs = new CashRebateReturnFactory(0.7d, 0d, 0d);
                break;
            case 4:
                fs = new CashRebateReturnFactory(1d, 300d, 100d);
                break;
            case 5:
                // 先打8折，再满减
                fs = new CashRebateReturnFactory(0.8d, 300d, 100d);

                break;
            case 6:
                fs = new CashReturnRebateFactory(0.7d, 200d, 50d);
                break;
        }

        this.cs = fs.createSalesModel();
    }

    public double getResult(double price, int num) {
        return this.cs.acceptCash(price, num);
    }
}
