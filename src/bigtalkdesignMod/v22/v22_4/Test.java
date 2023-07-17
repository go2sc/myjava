package bigtalkdesignMod.v22.v22_4;

public class Test {
    public static void main(String[] args) {
        HandsetBrand ab;

        ab = new HandsetBrandM();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();

        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

        HandsetBrand ab2;

        ab2 = new HandsetBrandN();
        ab2.setHandsetSoft(new HandsetGame());
        ab2.run();

        ab2.setHandsetSoft(new HandsetAddressList());
        ab2.run();
    }

}
