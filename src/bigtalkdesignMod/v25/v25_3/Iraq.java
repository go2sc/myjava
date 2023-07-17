package bigtalkdesignMod.v25.v25_3;

public class Iraq extends Country {

    public Iraq(UnitedNations unitedNations) {
        super(unitedNations);
        // TODO Auto-generated constructor stub
    }

    public void declare(String message) {
        this.unitedNations.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克获得对方信息:" + message);
    }
}
