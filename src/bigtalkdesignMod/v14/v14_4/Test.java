package bigtalkdesignMod.v14.v14_4;

public class Test {

    public static void main(String[] args) {
        Subject boss1 = new Boss("胡汉三");

        StockObserver employee1 = new StockObserver("魏关姹", boss1);
        NBAObserver employee2 = new NBAObserver("以观察", boss1);

        boss1.attach(employee1);
        boss1.attach(employee2);

        boss1.setAction("我胡汉三回来了");
        boss1.notifyEmployee();
    }

}
