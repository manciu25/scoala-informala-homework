package com.ski.biathlons;

/**Class that build SkiTimeResult */
public class SkiTimeResult {
    private int minutes;
    private int seconds;

    public SkiTimeResult(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int sec() {
        int total = this.minutes * 60 + this.seconds;
        return total;
    }

    @Override
    public String toString() {
        return "SkiTimeResult{" +
                "minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
