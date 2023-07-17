package bigtalkdesignMod.v14.v14_7;

import java.util.Observable;

public class Boss extends Observable {

    protected String name;
    private String action;

    public Boss(String name) {
        this.name = name;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String value) {
        this.action = value;

        super.setChanged();
        super.notifyObservers();
    }

}
