package bigtalkdesignMod.v16.v16_3;

public class Work {
    private int hour;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    private boolean workFinished = false;

    public boolean isWorkFinished() {
        return workFinished;
    }

    public void setWorkFinished(boolean workFinished) {
        this.workFinished = workFinished;
    }

    public void writeProgram() {
        if (hour < 12)
            System.out.println("当前时间：" + hour + "点 上午工作，精神百倍");
        else if (hour < 13)
            System.out.println("当前时间: " + hour + "点 饿了，午饭；犯困，午休。");
        else if (hour < 17)
            System.out.println("当前时间: " + hour + "点 下午状态还不错，继续努力");
        else {
            if (workFinished)
                System.out.println("当前时间: " + hour + "点 下班回家了");
            else {
                if (hour < 21)
                    System.out.println("当前时间: " + hour + "点 加班哦，疲累之极");
                else
                    System.out.println("当前时间: " + hour + "点 不行了，睡着了。");
            }
        }
    }
}
