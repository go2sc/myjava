package bigtalkdesignMod.v24.v24_5;

public abstract class Manager {
    protected String name;

    public Manager(String name) {
        this.name = name;
    }

    protected Manager superior;

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);

}
