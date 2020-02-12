package com.company;


/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before
 * midnight).
 *
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 *
 * JS: Added feature to support 12 hour clock display in UpdateDisplay()
 * JS:
 * JS:
 *
 * @author Michael Kölling and David J. Barnes and Jesus Sandoval
 * @version 2016.02.29
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the
     * parameters.
     */
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);

//        -------TO-DO-----------
//        When clock is created alarm should be in the
//        'OFF' position

    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();

//        When clock ticks to set alarm
//        message should print a ring simulation
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }

    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        int hour = hours.getValue();
        String suffix;

        if(hour >= 12)
        {
            suffix = "pm";
        }
        else {
            suffix = "am";
        }


        if(hour >= 12)
        {
            hour -= 12;
        }


        if(hour == 0)
        {
            hour = 12;
        }


        displayString = hour + "." +
                minutes.getDisplayValue() + suffix;
    }

    /**
     * ---------TO-DO-------------
     * Add method turnAlarmOn
     * takes int hour and int minute
     * Turns alarm on and sets it to the given time
     */


    /**
     * ---------TO-DO-------------
     * Add method turnAlarmOff
     * takes no parameters
     * Turns alarm off and alarm should not ring
     */


}
