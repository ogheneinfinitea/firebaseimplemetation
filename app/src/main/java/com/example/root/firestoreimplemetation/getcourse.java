package com.example.root.firestoreimplemetation;

import com.google.firebase.firestore.Exclude;




import com.google.firebase.firestore.Exclude;

public class getcourse {
    private String documentId;
    private String course_code;
    private String course_name;

    public getcourse(String course_code, String course_name) {
        this.course_code = course_code;
        this.course_name = course_name;
    }

    @Exclude
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }




}