package bigtalkdesignMod.v09.v9_3;

public class Prototype implements Cloneable {
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    protected Object clone() {

        Object object = null;

        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("Clone异常.");
        }

        // TODO Auto-generated method stub
        return object;
    }

}
