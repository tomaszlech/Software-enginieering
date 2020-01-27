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
            os.close();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPath(){
        return path;
    }
/*
    public static void main(String args[]){

        Contact contact = new Contact(1,"Pawel", "535231060");
        ContactEntry contactEntry = new ContactEntry(contact);

        Json json = new Json();
        json.serialize("asd", contactEntry);
        ContactEntry con = (ContactEntry) json.deserialize("asd");
        System.out.println(con.getAvailability().getCurrentDay());



    }
*/
}