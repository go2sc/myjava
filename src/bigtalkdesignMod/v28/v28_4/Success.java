package bigtalkdesignMod.v28.v28_4;

public class Success extends Action {

    @Override
    public void getManConclusion(Man concreteElementA) {
        // TODO Auto-generated method stub
        System.out.println(concreteElementA.getClass().getSimpleName() + " " + this.getClass().getSimpleName()
                + "时，背后多半有一个伟大的女人。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        // TODO Auto-generated method stub
        System.out.println(concreteElementB.getClass().getSimpleName() + " " + this.getClass().getSimpleName()
                + "时，背后大多有一个不成功的男人。");
    }

}
