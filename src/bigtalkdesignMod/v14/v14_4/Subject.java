package bigtalkdesignMod.v14.v14_4;

import java.util.ArrayList;

public abstract class Subject {
    protected String name;

    public Subject(String name) {
        this.name = name;
    }

    private ArrayList<Observer> list = new ArrayList<>();
    private String action;

    public void attach(Observer observer) {
        list.add(observer);
    }

    public void detach(Observer observer) {
        list.remove(observer);
    }

    public void notifyEmployee() {
        for (Observer item : list) {
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
