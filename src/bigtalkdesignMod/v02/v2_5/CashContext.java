package bigtalkdesignMod.v02.v2_5;

public class CashContext {

    private CashSuper cs;

    public CashContext(CashSuper csuper) {
        this.cs = csuper;
    }

    public double getResult(double price, int num) {
        return this.cs.acceptCash(price, num);
    }

}
