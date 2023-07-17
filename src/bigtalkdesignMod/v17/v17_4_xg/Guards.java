package bigtalkdesignMod.v17.v17_4_xg;

public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        System.out.println("后卫 " + this.name + " 进攻");
    }

    @Override
    public void defense() {
        // TODO Auto-generated method stub
        System.out.println("后卫 " + this.name + " 防守");
    }

}
