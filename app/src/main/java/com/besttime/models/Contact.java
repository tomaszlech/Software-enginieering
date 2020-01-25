package com.besttime.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact {

    private int mId;
    private String mName;
    private String mPhoneNumber;


    public Contact(@JsonProperty("mId") int id, @JsonProperty("mName")String name, @JsonProperty("mPhoneNumber")String phoneNumber) {
        this.mId = id;
        this.mName = name;
        this.mPhoneNumber = phoneNumber;
    }

    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }
}
