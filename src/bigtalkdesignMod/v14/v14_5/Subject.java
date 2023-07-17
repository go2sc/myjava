package bigtalkdesignMod.v14.v14_5;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> list = new ArrayList<>();

    public void attach(Observer observer) {
        list.add(observer);
    }

    public void detach(Observer observer) {
        list.remove(observer);
    }

    public void notifyObserver(){
        for (Observer item : list) {
            item.update();
        }
    }

    protected String subjectState;
    public String getSubjectState() {
        return this.subjectState;
    }

    public void setSubjectState(String value) {
        this.subjectState = value;
    }
}
