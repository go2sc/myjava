package bigtalkdesignMod.v09.v9_6;

public class WorkExperience implements Cloneable {

    private String timeArea;
    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected WorkExperience clone()  {
        WorkExperience object = null;

        try {
            object = (WorkExperience) super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("Clone异常.");
        }

        // TODO Auto-generated method stub
        return object;
    }

}
