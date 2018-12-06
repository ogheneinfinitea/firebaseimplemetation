package com.example.root.firestoreimplemetation;
import com.google.firebase.firestore.Exclude;

public class getlecturer {
    private String document_id;
    private String staff_id;
    private String name;
    private String address;
    private String phone;
    private String course;


    public getlecturer() {
        //public no-arg constructor needed
    }


    public getlecturer(String staff_id, String name, String address, String phone, String course) {
        this.staff_id = staff_id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.course = course;
    }



    @Exclude
    public String getDocument_id() {
        return document_id;
    }

    public void setDocument_id(String document_id) {
        this.document_id = document_id;
    }

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
