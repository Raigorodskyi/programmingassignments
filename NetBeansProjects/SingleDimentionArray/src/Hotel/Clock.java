package Hotel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 2003i
 */
public class Clock {
    private int hr;
    private int mi;
    private int se;
    private String city;

    public Clock(int hr, int mi, int se, String city) {
        this.hr = hr % 24;
        this.mi = mi % 60;
        this.se = se % 60;
        this.city = city;
    }
    
    @ Override
    public String toString() {
        return String.format("%02d:%02d:%02d  %s", hr, mi, se, city);
    }
}
