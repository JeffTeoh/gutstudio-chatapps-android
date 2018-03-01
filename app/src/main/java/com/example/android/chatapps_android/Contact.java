package com.example.android.chatapps_android;

/**
 * Created by Jeffrey on 3/1/2018.
 */

public class Contact {

    private String Name;
    private String Status;
    private int Photo;

    public Contact() {
    }

    public Contact(String name, String status, int photo) {
        Name = name;
        Status = status;
        Photo = photo;
    }

    // Getter
    public String getName() {
        return Name;
    }

    public String getStatus() {
        return Status;
    }

    public int getPhoto() {
        return Photo;
    }

    // Setter
    public void setName(String name) {
        Name = name;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
