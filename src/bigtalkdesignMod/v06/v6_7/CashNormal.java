package bigtalkdesignMod.v06.v6_7;

public class CashNormal implements ISale {

    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }

}
