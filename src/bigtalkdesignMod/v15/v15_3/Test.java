package bigtalkdesignMod.v15.v15_3;

public class Test {

    public static void main(String[] args) {
        User user = new User();
        IFactory factory = new SqlserverFactory();

        IUser iu = factory.createUser();

        iu.insert(user);
        iu.getUser(1);
    }
}
