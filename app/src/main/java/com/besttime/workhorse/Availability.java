package com.besttime.workhorse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.besttime.app.ContactEntry;

public class Availability {

private ContactEntry contact;
private Map<Hours,AvailType> currentDay = new HashMap<Hours, AvailType>();
private List<Map<Hours,AvailType>> availability = new ArrayList<Map<Hours,AvailType>>();


    public Map<Hours, AvailType> getCurrentDay() {
        return currentDay;
    }

    public void setAvailability(List<Map<Hours, AvailType>> availability) {
        this.availability = availability;
    }

    private void setCurrentDay(Map<Hours, AvailType> currentDay) {
        this.currentDay = currentDay;
    }

    public Availability(ContactEntry contact){
        this.contact = contact;
    }


    public void swapCurrentDay(CurrentTime currentTime){
    int dayAsDec = currentTime.getDayOfWeekAsDecimal();
    try {
        setCurrentDay(availability.get(dayAsDec));
    }
    catch (NullPointerException e){
        System.out.println(e);
    }



    }
}
