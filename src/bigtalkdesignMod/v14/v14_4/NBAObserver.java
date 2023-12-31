package bigtalkdesignMod.v14.v14_4;

public class NBAObserver extends Observer {

    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(super.sub.name + ": " + super.sub.getAction() + "! " + super.name + ", 请关闭NBA直播，赶紧工作。");
    }

}
