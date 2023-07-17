package bigtalkdesignMod.v20.v20_3;

public class ConcreteIteratorDesc extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.getCount() - 1;
    }

    @Override
    public Object currentItem() {
        return aggregate.getCurrentItem(current);
    }

    @Override
    public Object first() {
        // TODO Auto-generated method stub
        return aggregate.getCurrentItem(aggregate.getCount() - 1);
    }

    @Override
    public boolean isDone() {
        return current < 0;
    }

    @Override
    public Object next() {
        Object ret = null;
        current--;
        if (current >= 0) {
            ret = aggregate.getCurrentItem(current);
        }
        return ret;
    }

}
