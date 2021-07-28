package com.example.contact;


public class Contact {
    String name;
    String status;
    //


    public Contact(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
