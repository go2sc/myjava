package bigtalkdesignMod.v27.v27_2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        ArrayList<AbstractExpression> list = new ArrayList<>();

        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression exp : list) {
            exp.interpert(context);
        }
    }
}
