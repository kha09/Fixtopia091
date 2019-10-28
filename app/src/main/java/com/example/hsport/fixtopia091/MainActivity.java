package com.example.hsport.fixtopia091;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

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
