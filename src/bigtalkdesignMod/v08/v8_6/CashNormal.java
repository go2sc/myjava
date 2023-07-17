package bigtalkdesignMod.v08.v8_6;

public class CashNormal implements ISale {

    @Override
    public double acceptCash(double price, int num) {
        return price * num;
    }

}
