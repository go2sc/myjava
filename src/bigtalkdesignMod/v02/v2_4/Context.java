package bigtalkdesignMod.v02.v2_4;

public class Context {

    Strategy stragegy;

    public Context(Strategy strategy) {
        this.stragegy = strategy;
    }

    public void contextInterface() {
        stragegy.algorithmInterface();
    }
}
