package com.besttime.workhorse;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CurrentTimeTest {
Date testDate = new Date();
CurrentTime currentTimeTest = new CurrentTime();
    @Test
    public void getTimeTest() {

        System.out.println(currentTimeTest.getTime());
    }

    @Test
    public void getDayOfWeekAsDecimalTest() {
        System.out.println(currentTimeTest.getDayOfWeekAsDecimal());
    }
}