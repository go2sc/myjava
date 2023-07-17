package bigtalkdesignMod.v15.v15_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class DataAccess {
    private static String assemblyName = "bigtalkdesignMod.v15.v15_9.";

    public static String getDb() {
        String result = "";
        try {
            Properties properties = new Properties();

            String path = System.getProperty("user.dir") + "/src/bigtalkdesignMod/v15/v15_9/db.properties";
            System.out.println("path:" + path);

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            properties.load(bufferedReader);

            result = properties.getProperty("db");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return result;
    }

    private static Object getInstance(String className) {
        Object result = null;
        try {
            result = Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static IUser createUser() {
        String db = getDb();
        return (IUser) getInstance(assemblyName + db + "User");
    }

    public static IDepartment createDepartment() {
        String db = getDb();
        return (IDepartment) getInstance(assemblyName + db + "Department");
    }
}
