package bigtalkdesignMod.v23.v23_4;

public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void executeCommand();
}
