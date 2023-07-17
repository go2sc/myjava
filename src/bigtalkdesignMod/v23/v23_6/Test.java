package bigtalkdesignMod.v23.v23_6;

public class Test {

    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();

        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);

        Waiter girl = new Waiter();

        System.out.println("开门营业，顾客点菜");

        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand1);

        girl.cancelOrder(bakeChickenWingCommand1);

        girl.setOrder(bakeChickenWingCommand1);

        System.out.println("点菜完毕，通知厨房烧菜");
        girl.notifyCommand();

    }

}
