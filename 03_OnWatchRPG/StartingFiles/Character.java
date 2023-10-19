import java.util.ArrayList;

public abstract class Character implements OnWatch, DisplayAttitude {
    private String attitude;
    private final LongRest night;

    public Character(LongRest night) {
        this.night = night;
    }

    public void goToSleep() {
        night.goToSleep(this);
        this.setAttitude("Sleeping The Night Away");
    }

    public void stayAwakeForWatch() {
        night.stayAwake(this);
    }

    /* getters and setters methods */
    protected String getAttitude() {
        return this.attitude;
    }

    protected void setAttitude(String attitude) {
        this.attitude = attitude;
    }
}