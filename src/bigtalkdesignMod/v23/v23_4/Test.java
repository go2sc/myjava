package bigtalkdesignMod.v23.v23_4;

public class Test {
    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
