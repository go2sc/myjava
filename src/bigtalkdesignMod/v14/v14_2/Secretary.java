package bigtalkdesignMod.v14.v14_2;

import java.util.ArrayList;

public class Secretary {
    protected String name;

    public Secretary(String name) {
        this.name = name;
    }

    private ArrayList<StockObserver> list = new ArrayList<>();
    private String action;

    public void attach(StockObserver observer) {
        list.add(observer);
    }

    public void notifyEmployee() {
        for (StockObserver item : list) {
            item.update();
        }
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String value) {
        this.action = value;
    }

}
