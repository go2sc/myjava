package bigtalkdesignMod.v14.v14_2;

public class Test {

    public static void main(String[] args) {
        Secretary secretary1 = new Secretary("童子喆");

        StockObserver employee1 = new StockObserver("魏关姹", secretary1);
        StockObserver employee2 = new StockObserver("以观察", secretary1);

        secretary1.attach(employee1);
        secretary1.attach(employee2);

        secretary1.setAction("老板回来了");
        secretary1.notifyEmployee();
    }

}
