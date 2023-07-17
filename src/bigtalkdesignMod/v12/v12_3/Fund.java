package bigtalkdesignMod.v12.v12_3;

public class Fund {
    Stock1 stock1;
    Stock2 stock2;
    NationalDebt1 nd1;
    Realty1 rt1;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        nd1 = new NationalDebt1();
        rt1 = new Realty1();
    }

    public void buyFund() {
        stock1.buy();
        stock2.buy();
        nd1.buy();
        rt1.buy();
    }

    public void sellFund() {
        stock1.sell();
        stock2.sell();
        nd1.sell();
        rt1.sell();
    }

}
