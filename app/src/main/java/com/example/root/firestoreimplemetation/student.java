package com.example.root.firestoreimplemetation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class student extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private static final String KEY_TITLE = "title";
    private static final String KEY_DESCRIPTION = "description";

    private EditText edttextsReg_no;
    private EditText edttextsName;
    private EditText edttextsPhone;
    private EditText edttextsAddress;
    private EditText  edttextsEmail;
    private EditText edttextsLevel;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference notebookRef = db.collection("Student");
    private DocumentReference noteRef = db.document("Notebook/My First Note");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        edttextsReg_no = (EditText)findViewById(R.id.edttextsReg_no);
        edttextsName = (EditText) findViewById(R.id.edttextsName);
        edttextsPhone = (EditText) findViewById(R.id.edttextsPhone);
        edttextsAddress = (EditText) findViewById(R.id.edttextsAddress);
        edttextsEmail = (EditText) findViewById(R.id.edttextsEmail);
        edttextsLevel = (EditText) findViewById(R.id.edttextsLevel);

    }
    public void staff_btnSave(View v){

        String regno = edttextsReg_no.getText().toString();
        String address = edttextsAddress.getText().toString();
        String name= edttextsName.getText().toString();
        String email = edttextsEmail.getText().toString();
        String phone = edttextsPhone.getText().toString();
        String level = edttextsLevel.getText().toString();

        getstudent getstudent = new getstudent(regno, address,name,email,phone,level);
        notebookRef.add(getstudent);





    }


    public void staff_btnSearch(View v){

    }
    public void staff_btnDelete(View v){

    }
    public void staff_btnUpdate(View v){

    }


    }


