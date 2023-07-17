package bigtalkdesignMod.v14.v14_5;

public class ConcreteObserver extends Observer {

    private String name;
    private Subject sub;

    public ConcreteObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    @Override
    public void update() {
        System.out.println("观察者" + this.name + "的新状态是" + this.sub.getSubjectState());
    }

}
