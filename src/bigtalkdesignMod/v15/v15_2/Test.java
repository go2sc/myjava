package bigtalkdesignMod.v15.v15_2;

public class Test {

    public static void main(String[] args) {
        User user = new User();

        SqlserverUser su = new SqlserverUser();

        su.insert(user);
        su.getUser(1);
    }

}
