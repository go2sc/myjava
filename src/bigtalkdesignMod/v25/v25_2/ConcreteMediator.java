package bigtalkdesignMod.v25.v25_2;

public class ConcreteMediator extends Mediator {
    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    private ConcreteColleague1 colleague1;

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    private ConcreteColleague2 colleague2;

    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.notify(message);
        } else {
            colleague1.notify(message);
        }
    }
}
