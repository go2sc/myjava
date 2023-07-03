package bigtalkdesignMod.trainee.v0_11;

public class Monkey extends Animal {

    public Monkey() {
        super();
    }

    public Monkey(String name) {
        super(name);
    }

    @Override
    public String getShoutSound() {
        return "嗝嗝";
    }

}
