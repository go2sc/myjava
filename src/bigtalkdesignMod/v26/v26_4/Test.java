package bigtalkdesignMod.v26.v26_4;

public class Test {

    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();

        WebSite fx = f.getWEbSiteCategory("产品展示");
        fx.use(new User("小菜"));

        WebSite fy = f.getWEbSiteCategory("产品展示");
        fy.use(new User("大鸟"));

        WebSite fz = f.getWEbSiteCategory("产品展示");
        fz.use(new User("娇娇"));

        WebSite fl = f.getWEbSiteCategory("博客");
        fl.use(new User("老顽童"));

        WebSite fm = f.getWEbSiteCategory("博客");
        fm.use(new User("桃谷六仙"));

        WebSite fn = f.getWEbSiteCategory("博客");
        fn.use(new User("男孩鳄神"));

        System.out.println("网站分类总数为：" + f.getWebSiteCount());
    }

}
