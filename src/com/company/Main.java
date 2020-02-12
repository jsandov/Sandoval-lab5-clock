package com.company;

import java.lang.reflect.Parameter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClockDisplay clock = new ClockDisplay();
        clock.turnAlarmOn(3,33);

        clock.setTime(22, 30);
        System.out.println(clock.getTime());

        clock.setTime(10, 30);
        System.out.println(clock.getTime());

        clock.setTime(0, 0);
        System.out.println(clock.getTime());

        clock.setTime(12, 0);
        System.out.println(clock.getTime());




    }
}
