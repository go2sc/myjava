package bigtalkdesignMod.v26.v26_3;

import java.util.Hashtable;

public class WebSiteFactory {

    private Hashtable<String, WebSite> flyweights = new Hashtable<>();

    public WebSite getWEbSiteCategory(String key) {
        if (!flyweights.contains(key))
            flyweights.put(key, new ConcreteWebSite(key));
        return (WebSite) flyweights.get(key);
    }

    public int getWebSiteCount() {
        return flyweights.size();
    }

}
