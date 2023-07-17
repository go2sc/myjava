package bigtalkdesignMod.v08.v8_6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int disount;
        double price = 0d;
        int num = 0;
        double totalPrice = 0d;
        double total = 0d;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("请输入商品销售模式 1.原价 2.八折 3.七折: 4.满减 5.先打折再满减 6.先满减再打折");
            disount = Integer.parseInt(sc.nextLine());

            System.out.println("请输入商品单价:");
            price = Double.parseDouble(sc.nextLine());

            System.out.println("请输入商品数量:");
            num = Integer.parseInt(sc.nextLine());

            System.out.println();

            if (price > 0 && num > 0) {

                CashContext cc = new CashContext(disount);

                totalPrice = cc.getResult(price, num);

                total += totalPrice;

                System.out.println();
                System.out.println("单价:" + price + "元 数量:" + num + " 合计: " + totalPrice + "元");
                System.out.println();

                System.out.println("总计: " + total + "元");
                System.out.println();
            }
        } while (price > 0 && num > 0);
    }
}
