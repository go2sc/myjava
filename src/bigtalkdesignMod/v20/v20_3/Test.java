package bigtalkdesignMod.v20.v20_3;

public class Test {
    public static void main(String[] args) {
        ConcreteAggregate bus = new ConcreteAggregate();
        bus.add("大鸟");
        bus.add("小菜");
        bus.add("行李");
        bus.add("老外");
        bus.add("公交内部员工");
        bus.add("小偷");

        // Iterator conductor = new ConcreteIterator(bus);
        Iterator conductor = new ConcreteIteratorDesc(bus);

        conductor.first();
        while (!conductor.isDone()) {
            System.out.println(conductor.currentItem() + ", 请买车票！");
            conductor.next();
        }
    }

}
