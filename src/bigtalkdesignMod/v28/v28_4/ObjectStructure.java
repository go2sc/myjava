package bigtalkdesignMod.v28.v28_4;

import java.util.ArrayList;

public class ObjectStructure {

    private ArrayList<Person> elements = new ArrayList<>();

    public void attach(Person element) {
        elements.add(element);
    }

    public void detach(Person element) {
        elements.remove(element);
    }

    public void display(Action visitor) {
        for (Person e : elements) {
            e.accept(visitor);
        }
    }

}
