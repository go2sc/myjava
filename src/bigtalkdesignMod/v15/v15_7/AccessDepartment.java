package bigtalkdesignMod.v15.v15_7;

public class AccessDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("在 Access Server 中给 Department 表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在 Access Server 中根据用户 ID 得到 Department 表一条记录");
        return null;
    }

}
