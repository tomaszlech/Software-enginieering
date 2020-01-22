package com.besttime.workhorse;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ManagerAnkiet {

    public List<Map<Long,Date>> wyslaneAnkiety;

    public ManagerAnkiet(){
        this.wyslaneAnkiety = new ArrayList<Map<Long,Date>>();
    }


    public void addToList(Map<Long,Date> doDodania){
        try {
            this.wyslaneAnkiety.add(doDodania);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }


    public Map<Long,Date> znajdzPoIdAnkiety(Long idAnkiety){
        //Map<Date,Long> tmp = new HashMap<>();
        Date data;
        Map <Long,Date> tmp = new HashMap<Long,Date>();
        for(int i=0; i<this.wyslaneAnkiety.size(); i++)
        {
            if(wyslaneAnkiety.get(i).containsKey(idAnkiety)){
                data = wyslaneAnkiety.get(i).get(idAnkiety);
                tmp.put(idAnkiety,data);
                return tmp;
            }
        }
        Map<Long,Date> nieZnlazlo = new HashMap<>();
       return nieZnlazlo;

    }

}
