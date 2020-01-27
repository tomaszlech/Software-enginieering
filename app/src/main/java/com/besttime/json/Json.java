package com.besttime.json;

import java.io.*;

public class Json {
    private String path;



    public Json(String path){
        this.path = path;
    }

    public void serialize(String filename, Object object){
        try{
            FileOutputStream fs = new FileOutputStream(this.path +"/" + filename +".ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(object);
            os.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object deserialize(String filename){
        try {
            FileInputStream strumienPlk = new FileInputStream(this.path + "/" + filename+".ser");
            ObjectInputStream os = new ObjectInputStream(strumienPlk);
            Object obj = os.readObject();
            os.close();         //TUTAJ MOGA BYC BLEDY ODNOSNIE KTORY STRUMIEN PIERWSZY ZAMKNAC
            strumienPlk.close();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPath(){
        return path;
    }

}