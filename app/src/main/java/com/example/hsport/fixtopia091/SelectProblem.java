package com.example.hsport.fixtopia091;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class SelectProblem extends AppCompatActivity {
    private TextView textView;
    private RecyclerView recyclerView;
    private ExpandableRelativeLayout expandableRelativeLayout;
    private ArrayList<Phone> list;
    private AdapterClass adapterClass;
    private FirebaseFirestore firebaseFirestore;
    private static final String TAG = "FireLog";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_problem);
        setupUIViews();
        firebaseFirestore.collection("Phone").addSnapshotListener(new EventListener<QuerySnapshot>() {
            @Override
            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
                if(e != null){
                    Log.d(TAG, "Error: " + e.getMessage());
                }
                for(DocumentChange doc : queryDocumentSnapshots.getDocumentChanges()){
                    if(doc.getType() == DocumentChange.Type.ADDED){
                        Phone phone = doc.getDocument().toObject(Phone.class);
                        list.add(phone);
                        adapterClass.notifyDataSetChanged();
                    }
                }
            }
        });

    }
    public void setupUIViews(){
        textView = findViewById(R.id.tvPhoneModel);
        recyclerView = findViewById(R.id.rvExpLayoutMoblie);
        expandableRelativeLayout = findViewById(R.id.expLayout);
        firebaseFirestore = FirebaseFirestore.getInstance();
        list = new ArrayList<>();
        adapterClass = new AdapterClass(list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterClass);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expandableRelativeLayout.toggle();
            }
        });
    }
}
