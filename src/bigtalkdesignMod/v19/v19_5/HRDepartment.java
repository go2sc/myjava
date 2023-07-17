package bigtalkdesignMod.v19.v19_5;

public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        for (var i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        // TODO Auto-generated method stub
        System.out.println(name + " 员工招聘培训管理");
    }

}
