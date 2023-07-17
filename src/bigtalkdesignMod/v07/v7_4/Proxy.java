package bigtalkdesignMod.v07.v7_4;

public class Proxy implements IGiveGift {
    private Pursuit gg;

    public Proxy(SchoolGirl mm) {
        this.gg = new Pursuit(mm);
    }

    public void giveDolls() {
        this.gg.giveDolls();
    }

    public void giveFlowers() {
        this.gg.giveFlowers();
    }

    public void giveChocolate() {
        this.gg.giveChocolate();
    }

}
