package bigtalkdesignMod.v20.v20_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> bus = new ArrayList<>();
        bus.add("大鸟");
        bus.add("小菜");
        bus.add("行李");
        bus.add("老外");
        bus.add("公交内部员工");
        bus.add("小偷");

        System.out.println("foreach 遍历:");
        for (String item : bus) {
            System.out.println(item + ", 请买车票！");
        }

        System.out.println("Iterator 遍历:");
        Iterator<String> conductor = bus.iterator();
        while (conductor.hasNext()) {
            System.out.println(conductor.next() + ", 请买车票!");
        }

        System.out.println("ListIterator逆向遍历：");
        ListIterator<String> conductorDesc = bus.listIterator(bus.size());

        while (conductorDesc.hasPrevious()) {
            System.out.println(conductorDesc.previous() + ", 请买车票！");
        }
    }
}
