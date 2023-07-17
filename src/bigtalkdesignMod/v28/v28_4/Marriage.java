package bigtalkdesignMod.v28.v28_4;

public class Marriage extends Action {

    @Override
    public void getManConclusion(Man concreteElementA) {
        // TODO Auto-generated method stub
        System.out.println(concreteElementA.getClass().getSimpleName() + " " + this.getClass().getSimpleName()
                + "时，感慨到：恋爱游戏终结时，‘有妻徒刑’遥无期。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        // TODO Auto-generated method stub
        System.out.println(concreteElementB.getClass().getSimpleName() + " " + this.getClass().getSimpleName()
                + "时，欣慰曰: 爱情长跑路漫漫，婚宴保险保平安。");
    }

}
