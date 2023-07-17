package bigtalkdesignMod.v26.v26_2;

public class UnsharedConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        // TODO Auto-generated method stub
        System.out.println("不共享的具体 Flyweight:" + extrinsicstate);
    }

}
