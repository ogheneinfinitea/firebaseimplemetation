package com.example.root.firestoreimplemetation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class lecturer_profile extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private static final String KEY_TITLE = "title";
    private static final String KEY_DESCRIPTION = "description";

    private EditText edttextStaffid;
    private EditText edttextName;
    private EditText edttextaddress;
    private EditText edttextPhone;
    private EditText edtttextEmail;




    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference notebookRef = db.collection("Lecturer");
    private DocumentReference noteRef = db.document("Notebook/My First Note");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecturer_profile);
         edttextStaffid = (EditText)findViewById(R.id.edttextStaffid);
         edttextaddress = (EditText) findViewById(R.id.edttextAddress);
         edttextName = (EditText) findViewById(R.id.edttextName);
         edtttextEmail = (EditText) findViewById(R.id.edttextEmail);
        edttextPhone = (EditText) findViewById(R.id.edttextPhone);



    }
    public void staff_btnSave(View v){

    String Staff_id = edttextStaffid.getText().toString();
    String address = edttextaddress.getText().toString();
    String name= edttextName.getText().toString();
    String email = edtttextEmail.getText().toString();
    String phone = edttextPhone.getText().toString();

    getlecturer getlecturer = new getlecturer(Staff_id, address,name,email,phone);
    notebookRef.add(getlecturer);





    }


    public void staff_btnSearch(View v){

    }
    public void staff_btnDelete(View v){

    }
    public void staff_btnUpdate(View v){

    }

}

