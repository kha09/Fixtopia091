package com.example.hsport.fixtopia091;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class SelectProblem extends AppCompatActivity {
    TextView textView;
    RecyclerView recyclerView;
    ExpandableRelativeLayout expandableRelativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_problem);
        setupUIViews();

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expandableRelativeLayout.toggle();
            }
        });
    }
    public void setupUIViews(){
        textView = findViewById(R.id.tvPhoneModel);
        recyclerView = findViewById(R.id.rvExpLayoutMoblie);
        expandableRelativeLayout = findViewById(R.id.expLayout);


    }
}
