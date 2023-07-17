package bigtalkdesignMod.v10.v10_3;

public class Test {
    public static void main(String[] args) {
        System.out.println("学生甲抄的试卷:");
        TestPaperA sA = new TestPaperA();
        sA.testQuestion1();
        sA.testQuestion2();
        sA.testQuestion3();

        System.out.println("学生乙抄的试卷:");
        TestPaperA sB = new TestPaperA();
        sB.testQuestion1();
        sB.testQuestion2();
        sB.testQuestion3();
    }
}
