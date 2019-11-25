import java.text.ParseException;

public class Time {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public Time() { }

    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void print() {
        System.out.printf("Time is %d hours, %d minutes and %d seconds.", hours, minutes, seconds);
    }

    public void addHours(int value) {
        int newRawVal = hours + value;
        int overflow = newRawVal / 24;
        int remainder = newRawVal % 24;
        setHours(remainder);
    }

    public void addMinutes(int value) {
        int newRawVal = minutes + value;
        int overflow = newRawVal / 60;
        int remainder = newRawVal % 60;
        setMinutes(remainder);
        addHours(overflow);
    }

    public void addSeconds(int value) {
        int newRawVal = seconds + value;
        int overflow = newRawVal / 60;
        int remainder = newRawVal % 60;
        setSeconds(remainder);
        addMinutes(overflow);
    }

    public void setHours(int hours) {
        if (hours <= 24 && hours >= 0) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("bad hours value: " + hours);
        }
    }

    public void setMinutes(int minutes) {
        if (minutes <= 59 && minutes >= 0) {
            this.minutes = minutes;
        } else {
            throw new IllegalArgumentException("bad minutes value: " + minutes);
        }
    }

    public void setSeconds(int seconds) {
        if (seconds <= 59 && seconds >= 0) {
            this.seconds = seconds;
        } else {
            throw new IllegalArgumentException("bad seconds value: " + seconds);
        }
    }
}
