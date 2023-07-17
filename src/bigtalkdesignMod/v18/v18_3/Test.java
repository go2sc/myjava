package bigtalkdesignMod.v18.v18_3;

public class Test {
    public static void main(String[] args) {
        Originator o = new Originator();

        o.setState("On");

        o.show();

        Caretaker c = new Caretaker();

        c.setMemento(o.createMemento());

        o.setState("Off");
        o.show();

        o.recoveryMemento(c.getMemento());
    }

}
