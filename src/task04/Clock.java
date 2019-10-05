package task04;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        if (hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
        if (minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
        if (minute < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public void setHour(int hour) {
        if (hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public void setMinute(int minute) {
        if (minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public void setSecond(int second) {
        if (second < 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
