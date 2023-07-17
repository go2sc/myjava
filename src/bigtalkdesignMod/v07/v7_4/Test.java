package bigtalkdesignMod.v07.v7_4;

public class Test {
    public static void main(String[] args) {
        SchoolGirl girlLjj = new SchoolGirl();
        girlLjj.setName("李娇娇");

        Proxy boyDl = new Proxy(girlLjj);
        boyDl.giveDolls();
        boyDl.giveFlowers();
        boyDl.giveChocolate();

    }

}
