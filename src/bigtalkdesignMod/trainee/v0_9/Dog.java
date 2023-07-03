package bigtalkdesignMod.trainee.v0_9;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String getShoutSound() {
        return "汪";
    }
}
