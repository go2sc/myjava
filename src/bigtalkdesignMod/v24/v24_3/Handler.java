package bigtalkdesignMod.v24.v24_3;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleReuqest(int request);
}
