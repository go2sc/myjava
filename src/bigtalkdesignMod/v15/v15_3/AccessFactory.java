package bigtalkdesignMod.v15.v15_3;

public class AccessFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new AccessUser();
    }

}
