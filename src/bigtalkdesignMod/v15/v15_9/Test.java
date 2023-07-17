package bigtalkdesignMod.v15.v15_9;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        IUser iu = DataAccess.createUser();

        iu.insert(user);
        iu.getUser(1);

        IDepartment idept = DataAccess.createDepartment();
        idept.insert(department);
        idept.getDepartment(2);
    }

}
