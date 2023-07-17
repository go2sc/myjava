package bigtalkdesignMod.v23.v23_4;

public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void executeCommand() {
        // TODO Auto-generated method stub
        receiver.action();
    }

}
