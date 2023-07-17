package bigtalkdesignMod.v07.v7_2;

public class Test {
    public static void main(String[] args) {
        SchoolGirl girlLjj = new SchoolGirl();
        girlLjj.setName("李娇娇");

        Pursuit boyZjy = new Pursuit(girlLjj);

        boyZjy.giveDolls();
        boyZjy.giveFlowers();
        boyZjy.giveChocolate();
    }

}
