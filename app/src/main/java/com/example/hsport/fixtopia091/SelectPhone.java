package com.example.hsport.fixtopia091;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class SelectPhone extends AppCompatActivity {
    private Toolbar toolbar;
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_phone);
        setUpToolbar();
        cardView = findViewById(R.id.cadApple);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SelectPhone.this, SelectProblem.class);
                startActivity(intent);
            }
        });
    }

    private void setUpToolbar(){
        toolbar = findViewById(R.id.toolBar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

