package bigtalkdesignMod.v17.v17_2;

public class Adapter extends Target{
    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.specificRequest();
    }
}
