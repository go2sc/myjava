package bigtalkdesignMod.trainee;

public class Dog {
    private int shoutNum = 3;
    private String name = "";

    public Dog() {
        this.name = "无名";
    }

    public Dog(String name) {
        this.name = name;
    }

    public String shout() {

        String result = "";

        for (int i = 0; i < this.shoutNum; i++) {
            result += "汪 ";
        }

        return "我的名字叫" + name + " " + result;
    }

    public void setShoutNum(int value) {

        if (value <= 10) {
            this.shoutNum = value;
        } else {
            this.shoutNum = 10;
        }
    }

    public int getShoutNum() {
        return shoutNum;
    }
}
