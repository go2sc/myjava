package bigtalkdesignMod.trainee.v0_11;

public class StoneMonkey extends Monkey implements IChange {
    public StoneMonkey() {
        super();
    }

    public StoneMonkey(String name) {
        super(name);
    }

    @Override
    public String getShoutSound() {
        // TODO Auto-generated method stub
        return "俺老孙来也";
    }

    @Override
    public String changeThing(String thing) {
        // TODO Auto-generated method stub
        return super.shout() + "我会七十二变，" + thing;
    }
}
