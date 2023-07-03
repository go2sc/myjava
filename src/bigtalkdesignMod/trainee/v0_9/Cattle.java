package bigtalkdesignMod.trainee.v0_9;

public class Cattle extends Animal {
    public Cattle() {
        super();
    }

    public Cattle(String name) {
        super(name);
    }

    @Override
    public String getShoutSound() {
        return "哞";
    }
}
