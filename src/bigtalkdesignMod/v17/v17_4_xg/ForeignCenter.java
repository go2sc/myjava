package bigtalkdesignMod.v17.v17_4_xg;

public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println("外籍中锋 " + this.name + " 进攻");
    }

    public void 防守() {
        System.out.println("外籍中锋 " + this.name + " 防守");
    }
}
