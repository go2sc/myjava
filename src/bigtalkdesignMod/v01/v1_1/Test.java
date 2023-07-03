package bigtalkdesignMod.v01.v1_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数字A:");
        String A = sc.nextLine();

        System.out.println("请选择运算符号(+、-、*、/)");
        String B = sc.nextLine();

        System.out.println("请输入数字B:");
        String C = sc.nextLine();

        double D = 0d;

        if (B.equals("+")) {
            D = Double.parseDouble(A) + Double.parseDouble(C);
        }
        if (B.equals("-")) {
            D = Double.parseDouble(A) - Double.parseDouble(C);

        }
        if (B.equals("*")) {
            D = Double.parseDouble(A) * Double.parseDouble(C);

        }
        if (B.equals("/")) {
            D = Double.parseDouble(A) / Double.parseDouble(C);
        }

        System.out.println("结果是:" + D);
    }

}
