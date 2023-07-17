package bigtalkdesignMod.v17.v17_4;

public class Test {

    public static void main(String[] args) {
        Player forwards = new Forwards("巴蒂尔");
        forwards.attack();

        Player guards = new Guards("麦克格雷迪");
        guards.attack();

        Player center = new Center("姚明");
        center.attack();
        center.defense();
    }

}
