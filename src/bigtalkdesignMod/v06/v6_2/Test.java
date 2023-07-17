package bigtalkdesignMod.v06.v6_2;

public class Test {
    public static void main(String[] args) {
        Person xc = new Person("小菜");

        System.out.println("第一种装扮:");
        xc.wearTShirts();
        xc.wearBigTrouser();
        xc.wearSneakers();
        xc.show();

        System.out.println("第二种装扮:");
        xc.wearSuit();
        xc.wearTie();
        xc.wearLeatherShoes();
        xc.show();
    }

}
