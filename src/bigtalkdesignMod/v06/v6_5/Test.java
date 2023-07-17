package bigtalkdesignMod.v06.v6_5;

public class Test {

    public static void main(String[] args) {
        Person xc = new Person("小菜");

        System.out.println("第一种装扮:");
        Finery pqx = new Sneakers();
        pqx.decorate(xc);
        Finery kk = new BigTrouser();
        kk.decorate(pqx);

        Finery dtx = new TShirts();
        dtx.decorate(kk);
        dtx.show();

        System.out.println("第二种装扮:");
        Finery px = new LeatherShoes();
        px.decorate(xc);
        Finery ld = new Tie();
        ld.decorate(px);

        Finery xz = new Suit();
        xz.decorate(ld);

        xz.show();

        System.out.println("第三种装扮:");
        Finery pqx2 = new Sneakers();
        pqx2.decorate(xc);
        Finery px2 = new LeatherShoes();
        px2.decorate(pqx2);

        Finery kk2 = new BigTrouser();
        kk2.decorate(px2);
        Finery ld2 = new Tie();
        ld2.decorate(kk2);
        Finery cm2 = new Strawhat();
        cm2.decorate(ld2);

        cm2.show();
    }

}
