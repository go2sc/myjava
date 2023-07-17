package bigtalkdesignMod.v15.v15_4;

public class SqlserverDepartment implements IDepartment {

    public void insert(Department user) {
        System.out.println("在 SQL Server 中给 Department 表增加一条记录");
    }

    public Department getDepartment(int id) {
        System.out.println("在 SQL Server 中根据用户 ID 得到 Department 表一条记录");
        return null;
    }

}
