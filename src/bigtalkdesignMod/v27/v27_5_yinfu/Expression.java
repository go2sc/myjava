package bigtalkdesignMod.v27.v27_5_yinfu;

public abstract class Expression {
    public void interpert(PlayContext context) {
        if (context.getPlayText().length() == 0) {
            return;
        } else {
            String playKey = context.getPlayText().substring(0, 1);

            context.setPlayText(context.getPlayText().substring(2));

            double playValue = Double
                    .parseDouble(context.getPlayText().substring(0, context.getPlayText().indexOf(" ")));

            context.setPlayText(context.getPlayText().substring(context.getPlayText().indexOf(" ") + 1));

            this.excute(playKey, playValue);
        }
    }

    public abstract void excute(String key, double value);
}
