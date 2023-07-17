package bigtalkdesignMod.v15.v15_10;

public class CashNormal implements ISale {

    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }

}
