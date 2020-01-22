package com.besttime.workhorse;

import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ManagerAnkietTest {
ManagerAnkiet managerAnkietTest = new ManagerAnkiet();

Map<Long,Date> map1 = new HashMap<Long, Date>();
Map<Long,Date> map2 = new HashMap<Long, Date>();
Map<Long,Date> map3 = new HashMap<Long, Date>();
Map<Long,Date> map4 = new HashMap<Long, Date>();
Map<Long,Date> map5 = new HashMap<Long, Date>();
Map<Long,Date> map6 = new HashMap<Long, Date>();

Date data1 = new CurrentTime().getTime();
Date data2 = new CurrentTime().getTime();
Date data3 = new CurrentTime().getTime();
Date data4 = new CurrentTime().getTime();
Date data5 = new CurrentTime().getTime();
Date data6 = new CurrentTime().getTime();

public void puttingIntoMaps(){

    map1.put((long) 1,data1);
    map2.put((long) 2,data2);
    map3.put((long) 3,data3);
    map4.put((long) 4,data4);
    map5.put((long) 5,data5);
    map6.put((long) 6,data6);

}

    @Test
    public void addToList() {
    puttingIntoMaps();
        managerAnkietTest.addToList(map1);
        managerAnkietTest.addToList(map2);
        managerAnkietTest.addToList(map3);
        managerAnkietTest.addToList(map4);
        managerAnkietTest.addToList(map5);
        managerAnkietTest.addToList(map6);

        System.out.println(managerAnkietTest.wyslaneAnkiety);
    }

    @Test
    public void znajdzPoIdAnkiety() {

    }
}