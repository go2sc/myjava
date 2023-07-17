package bigtalkdesignMod.v08.v8_6;

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
