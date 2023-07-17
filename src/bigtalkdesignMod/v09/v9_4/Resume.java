package bigtalkdesignMod.v09.v9_4;

public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display() {
        System.out.println(this.name + " " + this.sex + " " + this.age);
        System.out.println("工作经历 " + this.timeArea + " " + this.company);
    }

    @Override
    protected Resume clone()  {
        Resume object = null;

        try {
            object = (Resume)super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("Clone异常.");
        }

        // TODO Auto-generated method stub
        return object;
    }

}
