package bigtalkdesignMod.v26.v26_4;

public class ConcreteWebSite extends WebSite {

    private String name = "";

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        // TODO Auto-generated method stub
        System.out.println("网站分类:" + name + " 用户:" + user.getName());
    }

}
