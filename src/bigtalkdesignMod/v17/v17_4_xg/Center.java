package bigtalkdesignMod.v17.v17_4_xg;

public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.println("中锋 " + this.name + " 进攻");
    }

    @Override
    public void defense() {
        // TODO Auto-generated method stub
        System.out.println("中锋 " + this.name + " 防守");
    }

}
