package bigtalkdesignMod.v28.v28_3;

public class Woman extends Person {
    @Override
    public void getConclusion() {
        // TODO Auto-generated method stub
        if (action == "成功") {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，背后大多有一个不成功的男人。");
        } else if (action == "失败") {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，眼泪汪汪，谁也劝不了。");
        } else if (action == "恋爱") {
            System.out.println(this.getClass().getSimpleName() + this.action + "时，遇事懂也装作不懂。");
        }
    }
}
