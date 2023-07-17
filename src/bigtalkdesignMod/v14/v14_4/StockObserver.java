package bigtalkdesignMod.v14.v14_4;

public class StockObserver extends Observer {

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(super.sub.name + ": " + super.sub.getAction() + "! " + super.name + ", 请关闭股票行情，赶紧工作。");
    }

}
