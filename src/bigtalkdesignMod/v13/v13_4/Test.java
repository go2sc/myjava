package bigtalkdesignMod.v13.v13_4;

public class Test {

    public static void main(String[] args) {
        PersonBuilder gThin = new PersonThinBuilder();
        PersonDirector pdThin = new PersonDirector(gThin);

        pdThin.CreatePerson();
    }

}
