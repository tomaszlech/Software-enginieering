package com.besttime;

import com.besttime.json.Json;
import com.besttime.models.Contact;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class JsonTest {
    private static Contact contactTest;
    private static Json jsonTest;
    private static String path;

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
    public void serializeTest_and_deserializeTest() throws IOException {
        jsonTest.serialize("kontakt",contactTest);
        Assert.assertEquals(contactTest,jsonTest.deserialize("kontakt"));
    }
}