package bigtalkdesignMod.v09.v9_5;

public class Test {
    public static void main(String[] args) {
        Resume resume1 = new Resume("大鸟");

        resume1.setPersonalInfo("男", "29");
        resume1.setWorkExperience("1998-2000", "xx公司");

        Resume resume2 = resume1.clone();
        resume2.setWorkExperience("2000-2004", "YY集团");

        resume1.display();
        resume2.display();
    }

}
