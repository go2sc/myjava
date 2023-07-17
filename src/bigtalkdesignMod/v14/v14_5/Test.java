package bigtalkdesignMod.v14.v14_5;

public class Test {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        subject.attach(new ConcreteObserver("NameX", subject));
        subject.attach(new ConcreteObserver("NameY", subject));
        subject.attach(new ConcreteObserver("NameZ", subject));

        subject.setSubjectState("ABC");

        subject.notifyObserver();
    }

}
