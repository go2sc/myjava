package bigtalkdesignMod.v16.v16_7;

public class Work {
    private State current;

    public Work() {
        current = new ForenoonState();
    }

    public void setState(State current) {
        this.current = current;
    }

    public void writeProgram() {
        this.current.writeProgram(this);
    }

    private int hour;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    // private Boolean workFinished = false;
    private boolean workFinished = false;

    public boolean isWorkFinished() {
        return workFinished;
    }

    public void setWorkFinished(boolean workFinished) {
        this.workFinished = workFinished;
    }
    
}
