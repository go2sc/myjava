package bigtalkdesignMod.v14.v14_8;

import java.util.Observable;

public class Subject extends Observable {

    protected String name;
    private String action;

    public Subject(String name) {
        this.name = name;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String value) {
        this.action = value;

        setChanged();
        notifyObservers();
    }

}
