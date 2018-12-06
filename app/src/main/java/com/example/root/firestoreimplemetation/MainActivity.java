package com.example.root.firestoreimplemetation;

import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private static final String KEY_TITLE = "title";
    private static final String KEY_DESCRIPTION = "description";

    private EditText edttextcourse_id;
    private EditText edttextcourse_name;
    private TextView textViewData;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference notebookRef = db.collection("Course");
    private DocumentReference noteRef = db.document("Notebook/My First Note");


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            edttextcourse_id = findViewById(R.id.edttextcourse_id);
            edttextcourse_name = findViewById(R.id.edttextcourse_name);
            textViewData = findViewById(R.id.text_view_data);
        }

        @Override
        protected void onStart() {
            super.onStart();
            notebookRef.addSnapshotListener(this, new EventListener<QuerySnapshot>() {
                @Override
                public void onEvent(QuerySnapshot queryDocumentSnapshots, FirebaseFirestoreException e) {
                    if (e != null) {
                        return;
                    }

                    String data = "";

                    for (QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
                        Note note = documentSnapshot.toObject(Note.class);
                        note.setDocumentId(documentSnapshot.getId());

                        String documentId = note.getDocumentId();
                        String title = note.getTitle();
                        String description = note.getDescription();




                        data += "ID: " + documentId
                                + "\nTitle: " + title + "\nDescription: " + description + "\n\n";
                    }

                    textViewData.setText(data);
                }
            });
        }

        public void addCourse(View v) {
            String id = edttextcourse_id.getText().toString();
            String name = edttextcourse_name.getText().toString();

            Note note = new Note(id, name);

            notebookRef.add(note);
        }

        public void loadCourse(View v) {
            notebookRef.get()
                    .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                        @Override
                        public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                            String data = "";

                            for (QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
                                Note note = documentSnapshot.toObject(Note.class);
                                note.setDocumentId(documentSnapshot.getId());

                                String documentId = note.getDocumentId();
                                String title = note.getTitle();
                                String description = note.getDescription();

                                data += "ID: " + documentId
                                        + "\nTitle: " + title + "\nDescription: " + description + "\n\n";
                            }

                            textViewData.setText(data);
                        }
                    });
        }

        public void searchcourse(){


        }
    }