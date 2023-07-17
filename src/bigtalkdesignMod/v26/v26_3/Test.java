package bigtalkdesignMod.v26.v26_3;

public class Test {

    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();

        WebSite fx = f.getWEbSiteCategory("产品展示");
        fx.use();

        WebSite fy = f.getWEbSiteCategory("产品展示");
        fy.use();

        WebSite fz = f.getWEbSiteCategory("产品展示");
        fz.use();

        WebSite fl = f.getWEbSiteCategory("博客");
        fl.use();

        WebSite fm = f.getWEbSiteCategory("博客");
        fm.use();

        WebSite fn = f.getWEbSiteCategory("博客");
        fn.use();
    }

}
