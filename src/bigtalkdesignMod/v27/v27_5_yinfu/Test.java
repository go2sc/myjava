package bigtalkdesignMod.v27.v27_5_yinfu;

public class Test {
    public static void main(String[] args) {
        PlayContext context = new PlayContext();

        System.out.println("音乐-上海滩");

        context.setPlayText(
                "T 500 0 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 0 3 C 1 0 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");

        Expression expression = null;
        while (context.getPlayText().length() > 0) {
            String str = context.getPlayText().substring(0, 1);

            switch (str) {
                case "0":
                    expression = new Scale();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expression = new Note();
                    break;
                case "T":
                    expression = new Speed();
                    break;
            }

            expression.interpert(context);
        }
    }
}
