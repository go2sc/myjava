package bigtalkdesignMod.v23.v23_5;

public class Test {

    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();

        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);

        Waiter girl = new Waiter();

        girl.setOrder(bakeMuttonCommand1);
        girl.notifyCommand();

        girl.setOrder(bakeMuttonCommand1);
        girl.notifyCommand();

        girl.setOrder(bakeChickenWingCommand1);
        girl.notifyCommand();

    }

}
