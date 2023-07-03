package bigtalkdesignMod.trainee;

public class Cat {

    private String name = "";

    public Cat() {
        this.name = "无名";
    }

    public Cat(String name) {
        this.name = name;
    }

    public String shout() {
        return "我的名字叫" + name + " 喵";
    }

    public String shoutV1() {
        return "喵";
    }
}

class Catv0 {
    private int shoutNum = 3;

    public void setShoutNum(int value) {
        this.shoutNum = value;
    }

    public int getShoutNum() {
        return shoutNum;
    }
}

class Catv1 {
    private int shoutNum = 3;

    // shoutNum 只读
    public int getShoutNum() {
        return shoutNum;
    }
}

class Catv2 {
    private int shoutNum = 3;

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

class Catv3 {

    private int shoutNum = 3;
    private String name = "";

    public Catv3() {
        this.name = "无名";
    }

    public Catv3(String name) {
        this.name = name;
    }

    public String shout() {

        String result = "";

        for (int i = 0; i < this.shoutNum; i++) {
            result += "喵 ";
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