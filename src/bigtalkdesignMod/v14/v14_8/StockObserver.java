package bigtalkdesignMod.v14.v14_8;

import java.util.Observable;
import java.util.Observer;

public class StockObserver implements Observer {

    protected String name;

    public StockObserver(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        Subject b = (Subject) o;

        System.out.println(b.name + ": " + b.getAction() + "! " + this.name + ", 请关闭股票行情，赶紧工作。");
    }
}
