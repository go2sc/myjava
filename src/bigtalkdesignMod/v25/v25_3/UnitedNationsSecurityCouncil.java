package bigtalkdesignMod.v25.v25_3;

public class UnitedNationsSecurityCouncil extends UnitedNations {

    private USA countryUSA;

    public void setCountryUSA(USA countryUSA) {
        this.countryUSA = countryUSA;
    }

    private Iraq countryIraq;

    public void setCountryIraq(Iraq countryIraq) {
        this.countryIraq = countryIraq;
    }

    @Override
    public void declare(String message, Country country) {
        if (country == this.countryUSA) {
            this.countryIraq.getMessage(message);
        } else if (country == this.countryIraq)
            this.countryUSA.getMessage(message);
    }

}
