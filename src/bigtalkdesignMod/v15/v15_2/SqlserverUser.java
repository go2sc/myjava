package bigtalkdesignMod.v15.v15_2;

public class SqlserverUser {

    public void insert(User user) {
        System.out.println("在 SQL Server 中给 User 表增加一条记录");
    }

    public User getUser(int id) {
        System.out.println("在 SQL Server 中根据用户 ID 得到 User 表一条记录");
        return null;
    }

}
