package bigtalkdesignMod.v22.v22_4;

public abstract class HandsetBrand {
    protected HandsetSoft soft;

    public abstract void run();

    public void setHandsetSoft(HandsetSoft soft) {
        this.soft = soft;
    }
}
