package bigtalkdesignMod.v24.v24_5;

public class Test {

    public static void main(String[] args) {
        Manager manager = new CommonManager("金利");
        Manager director = new Director("宗剑");
        Manager generalManager = new GeneralManager("钟精励");

        manager.setSuperior(director);
        director.setSuperior(generalManager);

        Request request = new Request();

        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(1);

        manager.requestApplications(request);

        Request request2 = new Request();

        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(4);

        manager.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("小菜请求加薪");
        request3.setNumber(5000);

        manager.requestApplications(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("小菜请求加薪");
        request4.setNumber(10000);

        manager.requestApplications(request4);

    }

}
