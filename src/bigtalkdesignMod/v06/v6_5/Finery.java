package bigtalkdesignMod.v06.v6_5;

public class Finery implements ICharacter {

    protected ICharacter component;

    public void decorate(ICharacter component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (this.component != null){
            this.component.show();
        }
    }

}
