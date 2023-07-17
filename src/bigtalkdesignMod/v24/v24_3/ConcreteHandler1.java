package bigtalkdesignMod.v24.v24_3;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleReuqest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println(this.getClass().getSimpleName() + " 处理请求 " + request);
        } else if (successor != null) {
            successor.handleReuqest(request);
        }
    }
}
