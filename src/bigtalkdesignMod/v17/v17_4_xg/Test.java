package bigtalkdesignMod.v17.v17_4_xg;

public class Test {

    public static void main(String[] args) {
        Player forwards = new Forwards("巴蒂尔");
        forwards.attack();

        Player guards = new Guards("麦克格雷迪");
        guards.attack();

        Player center = new Translator("姚明");
        center.attack();
        center.defense();
    }

}
