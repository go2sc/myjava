package bigtalkdesignMod.v24.v24_5;

public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        // TODO Auto-generated method stub
        if (request.getRequestType() == "请假" && request.getNumber() <= 2) {
            System.out.println(
                    this.name + ":" + request.getRequestContent() + " 数量:" + request.getNumber() + "天，被批准");
        } else {
            if (this.superior != null)
                this.superior.requestApplications(request);
        }
    }
}
