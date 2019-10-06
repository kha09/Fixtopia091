package com.example.hsport.fixtopia091;

import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bFirst;
    private Button BSec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonSetting();
        ButtonNext();
    }

    private void ButtonSetting(){
        bFirst = findViewById(R.id.ButOne);
        BSec = findViewById(R.id.ButTwo);
    }

    private void ButtonNext(){
        bFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SelectPhone.class);
                        startActivity(intent);
            }
        });
    }
}
