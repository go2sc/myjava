package bigtalkdesignMod.v24.v24_2;

public class Test {

    public static void main(String[] args) {
        Manager manager = new Manager("金利");
        Manager director = new Manager("宗剑");
        Manager generalManager = new Manager("钟精励");

        Request request = new Request();

        request.setRequestType("加薪");
        request.setRequestContent("小菜请求加薪");
        request.setNumber(10000);

        manager.getResult("经理", request);
        director.getResult("总监", request);
        generalManager.getResult("总经理", request);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(3);

        manager.getResult("经理", request2);
        director.getResult("总监", request2);
        generalManager.getResult("总经理", request2);

    }

}
