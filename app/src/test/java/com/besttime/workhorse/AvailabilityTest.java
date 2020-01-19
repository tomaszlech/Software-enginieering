package com.besttime.workhorse;

import com.besttime.app.ContactEntry;
import com.besttime.models.Contact;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AvailabilityTest {

    public CurrentTime currentTime = new CurrentTime();
    public Contact testContact = new Contact(1, "John", "123456789");
    public ContactEntry testContactEntry = new ContactEntry(testContact);
    public int testday = 0;

    @Test
    public void Test1(Contact testContact)
    {
        Availability availabilityTest = new Availability(testContactEntry);
        availabilityTest.swapCurrentDay(currentTime);
    }


}



