package com.besttime.workhorse;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ManagerAnkiet {

    private Map<Long,Date> wyslaneAnkiety;

    public Map<Long, Date> getWyslaneAnkiety() {
        return wyslaneAnkiety;
    }

    public ManagerAnkiet(){
        this.wyslaneAnkiety = new HashMap<Long,Date>();
    }


    public void addToMap(Long idAnkiety, Date data){
        try {

            this.wyslaneAnkiety.put(idAnkiety,data);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }


    public Date znajdzPoIdAnkiety(Long idAnkiety){
        try {
            return this.wyslaneAnkiety.get(idAnkiety);
        }
        catch (Exception e )
        {
            System.out.println(e);
        }
        return null;
    }

}
