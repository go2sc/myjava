package bigtalkdesignMod.v17.v17_4_xg;

public class Translator extends Player {

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        foreignCenter.进攻();
    }

    @Override
    public void defense() {
        // TODO Auto-generated method stub
        foreignCenter.防守();
    }

}
