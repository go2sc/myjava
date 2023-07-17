package bigtalkdesignMod.v07.v7_3;

public class Test {
    public static void main(String[] args) {
        SchoolGirl girlLjj = new SchoolGirl();
        girlLjj.setName("李娇娇");

        Proxy boyZjy = new Proxy(girlLjj);

        boyZjy.giveDolls();
        boyZjy.giveFlowers();
        boyZjy.giveChocolate();
    }

}
