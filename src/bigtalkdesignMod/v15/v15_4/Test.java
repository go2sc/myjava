package bigtalkdesignMod.v15.v15_4;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();
        IFactory factory = new SqlserverFactory();

        IUser iu = factory.createUser();

        iu.insert(user);
        iu.getUser(1);

        IDepartment idept = factory.createDepartment();
        idept.insert(department);
        idept.getDepartment(2);
    }
}
