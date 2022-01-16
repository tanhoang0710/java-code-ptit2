/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author DELL
 */
public class Time {
    private int hour, minute, sec;

    public Time(int hour, int minute, int sec) {
        this.hour = hour;
        this.minute = minute;
        this.sec = sec;
    }

    public int cmp() {
        return hour * 10000 + minute*100 + sec;
    }

    @Override
    public String toString() {
        return hour + " " + minute + " " + sec;
    }
}
