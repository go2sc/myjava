package bigtalkdesignMod.v25.v25_3;

public class USA extends Country {

    public USA(UnitedNations unitedNations) {
        super(unitedNations);
        // TODO Auto-generated constructor stub
    }

    public void declare(String message) {
        this.unitedNations.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("美国获得对方信息:" + message);
    }
}
