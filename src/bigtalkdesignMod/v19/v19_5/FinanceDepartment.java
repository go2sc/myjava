package bigtalkdesignMod.v19.v19_5;

public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
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
        System.out.println(name + " 公司财务收支管理");
    }

}
