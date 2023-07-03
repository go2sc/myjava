package bigtalkdesignMod.v02.v2_5;

public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }

}
