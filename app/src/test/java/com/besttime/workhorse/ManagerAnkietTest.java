package com.besttime.workhorse;

import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.besttime.workhorse.ManagerAnkiet;

import static org.junit.Assert.*;

public class ManagerAnkietTest {
ManagerAnkiet managerAnkietTest = new ManagerAnkiet();


Date data1 = new CurrentTime().getTime();
Date data2 = new CurrentTime().getTime();
Date data3 = new CurrentTime().getTime();
Date data4 = new CurrentTime().getTime();
Date data5 = new CurrentTime().getTime();
Date data6 = new Date(2323223232L);
Date data7 = new CurrentTime().getTime();





    @Test
    public void addToList() {

        managerAnkietTest.addToMap((long) 1,data1);
        managerAnkietTest.addToMap((long) 2,data2);
        managerAnkietTest.addToMap((long) 3,data3);
        managerAnkietTest.addToMap((long) 4,data4);
        managerAnkietTest.addToMap((long) 5,data5);
        managerAnkietTest.addToMap((long) 6,data6);
        managerAnkietTest.addToMap((long) 6,data7);

    System.out.println(managerAnkietTest.getWyslaneAnkiety());
        //managerAnkietTest.wyslaneAnkiety.clear();
    }

    @Test
    public void znajdzPoIdAnkiety() {
        managerAnkietTest.addToMap((long) 1,data1);
        managerAnkietTest.addToMap((long) 2,data2);
        managerAnkietTest.addToMap((long) 3,data3);
        managerAnkietTest.addToMap((long) 4,data4);
        managerAnkietTest.addToMap((long) 5,data5);
        managerAnkietTest.addToMap((long) 6,data6);

        System.out.println(managerAnkietTest.znajdzPoIdAnkiety((long)2));
    }
}