package bigtalkdesignMod.v06.v6_7;

public abstract class CashSuper implements ISale {

    protected ISale component;

    public void decorate(ISale component) {
        this.component = component;
    }

    public double acceptCash(double price, int num) {
        var result = 0d;

        if (this.component != null) {
            result = this.component.acceptCash(price, num);
        }

        return result;
    }
}
