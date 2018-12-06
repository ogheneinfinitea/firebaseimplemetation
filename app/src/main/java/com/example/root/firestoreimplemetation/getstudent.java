package com.example.root.firestoreimplemetation;

import com.google.firebase.firestore.Exclude;

public class getstudent {

    private  String Document_id;
    private  String regno;
    private String name;
    private String Level;
    private String phone;
    private String address;
    private String email;

    public getstudent(String regno, String name, String level, String phone, String address, String email) {
        this.regno = regno;
        this.name = name;
        Level = level;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    @Exclude
    public String getDocument_id() {
        return Document_id;
    }

    public void setDocument_id(String document_id) {
        Document_id = document_id;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
