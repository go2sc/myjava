package bigtalkdesignMod.v14.v14_8_beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class StockObserver implements PropertyChangeListener {

    protected String name;

    public StockObserver(String name) {
        this.name = name;
    }

    // public void update(PropertyChangeEvent event) {

    // if ("action".equals(event.getPropertyName())) {
    // String newValue = (String) event.getNewValue();
    // System.out.println();
    // }

    // Subject b = (Subject) o;

    // System.out.println(b.name + ": " + b.getAction() + "! " + this.name + ",
    // 请关闭股票行情，赶紧工作。");
    // }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        if ("action".equals(event.getPropertyName())) {

            Subject b = (Subject) event.getSource();

            // String action = (String) event.getNewValue();
            System.out.println(b.name + ": " + b.getAction() + "! " + this.name + ", 请关闭股票行情，赶紧工作。");
        }

    }
}
