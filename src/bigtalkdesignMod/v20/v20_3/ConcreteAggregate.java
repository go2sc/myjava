package bigtalkdesignMod.v20.v20_3;

import java.util.ArrayList;

public class ConcreteAggregate extends Aggregate {

    private ArrayList<Object> items = new ArrayList<Object>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getCount() {
        return items.size();
    }

    public void add(Object object) {
        items.add(object);
    }

    public Object getCurrentItem(int index) {
        return items.get(index);
    }
}
