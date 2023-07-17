package bigtalkdesignMod.v15.v15_3;

public class SqlserverFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

}
