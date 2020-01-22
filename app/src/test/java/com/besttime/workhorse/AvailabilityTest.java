package com.besttime.workhorse;

import com.besttime.app.ContactEntry;
import com.besttime.models.Contact;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class AvailabilityTest {

    public CurrentTime currentTime = new CurrentTime();
    public Contact testContact = new Contact(1, "John", "123456789");
    public ContactEntry testContactEntry = new ContactEntry(testContact);
    public List<Map<Hours,AvailType>> undefinedList = new ArrayList<Map<Hours,AvailType>>(7);


    @Test
    public void setUndefinedListTest()
    {

        Availability availabilityTest = new Availability(testContactEntry);

        availabilityTest.setUndefindAvailability();
        undefinedList = availabilityTest.getAvailability();

        for(int i=0; i<availabilityTest.getAvailability().size(); i++) {

            System.out.println(undefinedList.get(i));
        }

    }

    @Test
    public void getCurrentDayTest(){
        Availability availabilityTest = new Availability(testContactEntry);
        availabilityTest.setUndefindAvailability();
        //undefinedList = availabilityTest.getAvailability();

        System.out.println(availabilityTest.getCurrentDay());
    }

    @Test
    public void swapdaysTest(){
        Availability availabilityTest = new Availability(testContactEntry);
        availabilityTest.setUndefindAvailability();
        undefinedList = availabilityTest.getAvailability();


    }
}



