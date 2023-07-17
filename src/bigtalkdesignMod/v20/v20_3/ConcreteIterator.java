package bigtalkdesignMod.v20.v20_3;

public class ConcreteIterator extends Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object currentItem() {
        return aggregate.getCurrentItem(current);
    }

    @Override
    public Object first() {
        // TODO Auto-generated method stub
        return aggregate.getCurrentItem(0);
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.getCount();
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if (current < aggregate.getCount()) {
            ret = aggregate.getCurrentItem(current);
        }
        return ret;
    }

}
