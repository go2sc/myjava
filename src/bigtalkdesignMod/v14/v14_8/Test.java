package bigtalkdesignMod.v14.v14_8;

import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        Boss boss1 = new Boss("胡汉三");

        Observer employee1 = new StockObserver("魏关姹");
        Observer employee2 = new StockObserver("易管查");
        Observer employee3 = new StockObserver("兰秋幂");

        boss1.addObserver(employee1);
        boss1.addObserver(employee2);
        boss1.addObserver(employee3);

        boss1.deleteObserver(employee1);

        boss1.setAction("我胡汉三回来了！");
    }

}
