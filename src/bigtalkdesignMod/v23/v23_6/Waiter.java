package bigtalkdesignMod.v23.v23_6;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Waiter {

    private ArrayList<Command> orders = new ArrayList<>();

    private Command command;

    public void setOrder(Command command) {
        String className = command.getClass().getSimpleName();

        if (className.equals("BakeChickenWingCommand")) {
            System.out.println("服务员:鸡翅没了，请点别的烧烤");
        } else {
            this.orders.add(command);
            System.out.println("增加订单:" + className + " 时间:" + getNowTime());
        }

    }

    public void cancelOrder(Command command) {
        String className = command.getClass().getSimpleName();
        orders.remove(command);
        System.out.println("取消订单:" + className + " 时间:" + getNowTime());
    }

    public void notifyCommand() {
        for (Command command : orders) {
            command.excuteCommand();
        }
    }

    private String getNowTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        return formatter.format(new Date()).toString();
    }
}
