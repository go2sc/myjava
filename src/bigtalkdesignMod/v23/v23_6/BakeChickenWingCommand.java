package bigtalkdesignMod.v23.v23_6;

public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        // TODO Auto-generated method stub
        receiver.bakeChickenWing();
    }

}
