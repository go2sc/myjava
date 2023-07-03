package bigtalkdesignMod.trainee.v0_10;

public abstract class Animal {
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
        String result = "";

        for (int i = 0; i < this.shoutNum; i++) {
            result += getShoutSound() + ", ";
        }

        return "我的名字叫" + name + " " + result;
    }

    public abstract String getShoutSound();
}
