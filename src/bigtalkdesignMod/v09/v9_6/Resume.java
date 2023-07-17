package bigtalkdesignMod.v09.v9_6;

public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        this.work = new WorkExperience();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.work.setTimeArea(timeArea);
        this.work.setCompany(company);
    }

    public void display() {
        System.out.println(this.name + " " + this.sex + " " + this.age);
        System.out.println("工作经历 " + this.work.getTimeArea() + " " + this.work.getCompany());
    }

    @Override
    protected Resume clone() {
        Resume object = null;

        try {
            object = (Resume) super.clone();
            object.work = this.work.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println("Clone异常.");
        }

        // TODO Auto-generated method stub
        return object;
    }

}
