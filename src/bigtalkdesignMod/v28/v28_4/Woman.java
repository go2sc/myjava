package bigtalkdesignMod.v28.v28_4;

public class Woman extends Person {

    @Override
    public void accept(Action visitor) {
        // TODO Auto-generated method stub
        visitor.getWomanConclusion(this);
    }

}
