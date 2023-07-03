package bigtalkdesignMod.trainee.v0_11;

public class MachinecCat extends Cat implements IChange {

    public MachinecCat() {
        super();
    }

    public MachinecCat(String name) {
        super(name);
    }

    @Override
    public String changeThing(String thing) {
        // TODO Auto-generated method stub
        return super.shout() + "我有万能口袋，我可变出" + thing;
    }

}
