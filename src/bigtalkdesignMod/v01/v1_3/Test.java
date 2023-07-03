package bigtalkdesignMod.v01.v1_3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入数字A:");
            String numberA = sc.nextLine();

            System.out.println("请选择运算符号(+、-、*、/)");
            String strOperator = sc.nextLine();

            System.out.println("请输入数字B:");
            String numberB = sc.nextLine();

            double Result = 0d;

            switch (strOperator) {
                case "+":
                    Result = Double.parseDouble(numberA) + Double.parseDouble(numberB);
                    break;
                case "-":
                    Result = Double.parseDouble(numberA) - Double.parseDouble(numberB);
                    break;
                case "*":
                    Result = Double.parseDouble(numberA) * Double.parseDouble(numberB);
                    break;
                case "/":
                    Result = Double.parseDouble(numberA) / Double.parseDouble(numberB);
                    break;

            }

            System.out.println("结果是:" + Result);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("你的输入有错:" + e.toString());
        }

    }

}
