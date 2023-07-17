package bigtalkdesignMod.v28.v28_4;

public class Amativeness extends Action {

    @Override
    public void getManConclusion(Man concreteElementA) {
        // TODO Auto-generated method stub
        System.out.println(concreteElementA.getClass().getSimpleName() + " " + this.getClass().getSimpleName()
                + "时，凡事不懂也要装懂。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        // TODO Auto-generated method stub
        System.out.println(concreteElementB.getClass().getSimpleName() + " " + this.getClass().getSimpleName()
                + "时，遇事懂也装作不懂。");
    }

}
