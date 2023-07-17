package bigtalkdesignMod.v19.v19_5;

import java.util.ArrayList;

public class ConcreteCompany extends Company {

    protected ArrayList<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        // TODO Auto-generated method stub
        children.add(company);
    }

    @Override
    public void display(int depth) {
        // TODO Auto-generated method stub
        for (var i = 0; i < depth; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Company item : children) {
            item.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        // TODO Auto-generated method stub
        for (Company item : children) {
            item.lineOfDuty();
        }
    }

    @Override
    public void remove(Company company) {
        // TODO Auto-generated method stub
        children.remove(company);
    }

}
