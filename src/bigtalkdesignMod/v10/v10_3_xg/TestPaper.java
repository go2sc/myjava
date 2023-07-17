package bigtalkdesignMod.v10.v10_3_xg;

public abstract class TestPaper {

    public void testQuestion1() {
        System.out.println("问题1：[]" +
                " a.1 b.2 c.3 d.4");
        System.out.println("答案: " + this.answer1());
    }

    protected abstract String answer1();

    public void testQuestion2() {
        System.out.println("问题2：[]" +
                " a.1 b.2 c.3 d.4");
        System.out.println("答案: " + this.answer2());

    }

    protected abstract String answer2();

    public void testQuestion3() {
        System.out.println("问题3：[]" +
                " a.1 b.2 c.3 d.4");

        System.out.println("答案: " + this.answer3());
    }

    protected abstract String answer3();
}
