package bigtalkdesignMod.v06.v6_6;

public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }

}
