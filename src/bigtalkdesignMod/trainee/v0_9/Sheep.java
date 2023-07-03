package bigtalkdesignMod.trainee.v0_9;

public class Sheep extends Animal {
    public Sheep() {
        super();
    }

    public Sheep(String name) {
        super(name);
    }

    @Override
    public String getShoutSound() {
        return "咩";
    }
}
