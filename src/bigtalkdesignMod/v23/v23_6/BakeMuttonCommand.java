package bigtalkdesignMod.v23.v23_6;

public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        // TODO Auto-generated method stub
        receiver.bakeMutton();
    }

}
