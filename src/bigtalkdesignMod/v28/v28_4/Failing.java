package bigtalkdesignMod.v28.v28_4;

public class Failing extends Action {

    @Override
    public void getManConclusion(Man concreteElementA) {
        // TODO Auto-generated method stub
        System.out.println(concreteElementA.getClass().getSimpleName() + " " + this.getClass().getSimpleName()
                + "时，闷头喝酒，谁也不用劝。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        // TODO Auto-generated method stub
        System.out.println(concreteElementB.getClass().getSimpleName() + " " + this.getClass().getSimpleName()
                + "时，眼泪汪汪，谁也劝不了。");
    }

}
