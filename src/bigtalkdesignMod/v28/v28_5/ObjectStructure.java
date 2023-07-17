package bigtalkdesignMod.v28.v28_5;

import java.util.ArrayList;

public class ObjectStructure {

    private ArrayList<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.add(element);
    }

    public void accept(Visitor visitor) {
        for (Element e : elements) {
            e.accept(visitor);
        }
    }

}
