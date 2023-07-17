package bigtalkdesignMod.v09.v9_2;

public class Test {
    public static void main(String[] args) {
        Resume resume1 = new Resume("大鸟");

        resume1.setPersonalInfo("男", "29");
        resume1.setWorkExperience("1998-2000", "xx公司");

        resume1.display();
    }

}
