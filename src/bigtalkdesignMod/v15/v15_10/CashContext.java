package bigtalkdesignMod.v15.v15_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class CashContext {

    private static String assemblyName = "bigtalkdesignMod.v15.v15_10.";
    private ISale cs;

    public CashContext(int cashType) {
        String[] config = getConfig(cashType).split(",");

        IFactory fs = getInstance(config[0], Double.parseDouble(config[1]), Double.parseDouble(config[2]), Double.parseDouble(config[3]));
        this.cs = fs.createSalesModel();
    }

    private String getConfig(int number) {
        String result = "";

        try {
            Properties properties = new Properties();
            String path = System.getProperty("user.dir") + "/src/bigtalkdesignMod/v15/v15_10/data.properties";
            System.out.println("path:" + path);

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            properties.load(bufferedReader);
            result = properties.getProperty("strategy" + number);
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        return result;
    }

    public double getResult(double price, int num) {
        return this.cs.acceptCash(price, num);
    }

    private static IFactory getInstance(String className, double a, double b, double c) {
        IFactory result = null;
        try {
            result = (IFactory) Class.forName(assemblyName + className)
                    .getDeclaredConstructor(new Class[] { double.class, double.class, double.class })
                    .newInstance(new Object[] { a, b, c });
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
}
