package bigtalkdesignMod.v25.v25_2;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
        // TODO Auto-generated constructor stub
    }

    public void send(String message) {
        this.mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("同事2得到信息:" + message);
    }
}
