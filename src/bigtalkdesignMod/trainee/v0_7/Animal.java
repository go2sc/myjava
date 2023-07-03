package bigtalkdesignMod.trainee.v0_7;

public class Animal {
    protected String name = "";

    public Animal() {
        this.name = "无名";
    }

    public Animal(String name) {
        this.name = name;
    }

    protected int shoutNum = 3;

    public void setShoutNum(int value) {
        this.shoutNum = value;
    }

    public int getShoutNum() {
        return shoutNum;
    }

    public String shout() {
        return "";
    }
}
