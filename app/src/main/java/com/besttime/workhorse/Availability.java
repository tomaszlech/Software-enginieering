package com.besttime.workhorse;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import com.besttime.app.ContactEntry;


import static com.besttime.workhorse.AvailType.*;
import static com.besttime.workhorse.Hours.*;

public class Availability {

private ContactEntry contact;
private Map<Hours,AvailType> currentDay;
private List<Map<Hours,AvailType>> availability;


    public Map<Hours, AvailType> getCurrentDay() {
        return currentDay;
    }

    public void setAvailability(List<Map<Hours, AvailType>> availability) {
        this.availability = availability;
    }

    private void setCurrentDay(Map<Hours, AvailType> currentDay) {
        this.currentDay = currentDay;
    }

    public List<Map<Hours, AvailType>> getAvailability() {
        return availability;
    }

    public Availability(ContactEntry contact){
        this.contact = contact;
        this.currentDay = new HashMap<Hours, AvailType>();
        this.currentDay = fillUndefined();
        this.availability = new ArrayList<Map<Hours,AvailType>>(7);
        setUndefindAvailability();
    }


    public void swapCurrentDay(CurrentTime currentTime) {
        int dayAsDec = currentTime.getDayOfWeekAsDecimal();
        try {
            setCurrentDay(availability.get(dayAsDec));
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    private Map<Hours,AvailType> fillUndefined(){
        Map<Hours,AvailType> oneDayMap = new HashMap<>();
        for(Hours hour: Hours.values())
        {
            oneDayMap.put(hour, undefined);
        }

        return oneDayMap;
    }

    public void setUndefindAvailability(){
        List<Map<Hours,AvailType>> tmp = new ArrayList<>(7);
        this.availability.clear();
        for(int i =0; i<7; i++){
            tmp.add(fillUndefined());
        }
        setAvailability(tmp);
    }


}
