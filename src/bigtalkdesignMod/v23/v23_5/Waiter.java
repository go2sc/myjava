package bigtalkdesignMod.v23.v23_5;

public class Waiter {

    private Command command;

    public void setOrder(Command command) {
        this.command = command;
    }

    public void notifyCommand() {
        command.excuteCommand();
    }
}
