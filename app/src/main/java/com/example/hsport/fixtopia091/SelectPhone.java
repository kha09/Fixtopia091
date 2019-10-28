package com.example.hsport.fixtopia091;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;


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

