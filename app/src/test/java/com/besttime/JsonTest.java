package com.besttime;

import android.os.CpuUsageInfo;

import com.besttime.app.ContactEntry;
import com.besttime.json.Json;
import com.besttime.models.Contact;
import com.besttime.workhorse.Availability;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;



public class JsonTest {
    private static Contact contactTest;
    private static Json jsonTest;
    private static String path;
    private static ContactEntry contactEntryTest;
    private static Availability availabilityTest;

    @BeforeClass
    public static void setup(){
        contactTest = new Contact(1, "Tomasz", "123456789");
        path = "/home/tomasz/StudioProjects/Software-enginieeringWirus/app/src/test/java/com/besttime";
        jsonTest = new Json(path);


    }



    @Test
    public void getPathTest(){
        Assert.assertEquals(path, jsonTest.getPath());
        System.out.println(contactTest);
    }

    @Test
    public void serialize_and_deserialize_Contact() throws IOException {
        jsonTest.serialize("kontakt",contactTest);

        Contact k1;
        k1 = (Contact)jsonTest.deserialize("kontakt");
        assertSame(k1.getId(),contactTest.getId());

    }


    @Before
    public void setContactEntryAndAvailability(){
        contactEntryTest = new ContactEntry(contactTest);
        availabilityTest = new Availability(contactEntryTest);
    }

    @Test
    public void serialize_and_deserialize_ContactEntry() throws IOException {
        jsonTest.serialize("contactEntryTest", contactEntryTest);
        ContactEntry k = (ContactEntry)jsonTest.deserialize("contactEntryTest");
        assertEquals(contactEntryTest.getAvailability().getCurrentDay(),k.getAvailability().getCurrentDay());
    }

    @Before
    public
    @Test
}