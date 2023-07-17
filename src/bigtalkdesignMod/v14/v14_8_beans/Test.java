package bigtalkdesignMod.v14.v14_8_beans;

public class Test {
    public static void main(String[] args) {
        Boss boss1 = new Boss("胡汉三");

        StockObserver employee1 = new StockObserver("魏关姹");
        StockObserver employee2 = new StockObserver("易管查");
        StockObserver employee3 = new StockObserver("兰秋幂");

        boss1.addObserver(employee1);
        boss1.addObserver(employee2);
        boss1.addObserver(employee3);

        boss1.deleteObserver(employee1);

        boss1.setAction("我胡汉三回来了！");
        boss1.setAction("我胡汉四回来了！");
    }
}
