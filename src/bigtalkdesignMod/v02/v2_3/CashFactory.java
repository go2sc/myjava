package bigtalkdesignMod.v02.v2_3;

public class CashFactory {
    public static CashSuper createCashAccept(int cashType) {
        CashSuper cs = null;

        switch (cashType) {
            case 1:
                cs = new CashNormal();
                break;
            case 2:
                cs = new CashRebate(0.8d);
                break; // 8折
            case 3:
                cs = new CashRebate(0.7d);
                break; // 7折
            case 4:
                cs = new CashReturn(300d, 100d);
                break; // 满300-100
        }

        return cs;
    }
}
