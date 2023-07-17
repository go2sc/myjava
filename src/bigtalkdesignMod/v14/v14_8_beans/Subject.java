package bigtalkdesignMod.v14.v14_8_beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Subject {

    private PropertyChangeSupport support;

    protected String name;
    private String action;

    public Subject(String name) {
        this.name = name;
        support = new PropertyChangeSupport(this);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String value) {
        String oldValue = this.action;
        this.action = value;

        support.firePropertyChange("action", oldValue, value);
    }

    public void addObserver(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void deleteObserver(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
