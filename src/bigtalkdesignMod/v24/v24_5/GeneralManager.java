package bigtalkdesignMod.v24.v24_5;

public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        // TODO Auto-generated method stub
        if (request.getRequestType() == "请假")
            System.out.println(
                    this.name + ":" + request.getRequestContent() + " 数量:" + request.getNumber() + "天，被批准");
        else if (request.getRequestType() == "加薪" && request.getNumber() <= 5000)
            System.out.println(
                    this.name + ":" + request.getRequestContent() + " 数量:" + request.getNumber() + "天，被批准");
        else if (request.getRequestType() == "加薪" && request.getNumber() > 5000)
            System.out.println(
                    this.name + ":" + request.getRequestContent() + " 数量:" + request.getNumber() + "天，再说吧");
    }
}
