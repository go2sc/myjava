package bigtalkdesignMod.v28.v28_3;

public class Man extends Person {

    @Override
    public void getConclusion() {
        // TODO Auto-generated method stub
        if (action == "成功") {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，背后多半有一个伟大的女人。");
        } else if (action == "失败") {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，闷头喝酒，谁也不用劝。");
        } else if (action == "恋爱") {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，凡事不懂也要装懂。");
        }
    }

}
