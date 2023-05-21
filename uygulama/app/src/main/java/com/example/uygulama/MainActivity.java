package com.example.uygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btn_kayit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_kayit=findViewById(R.id.btn_kayit);
        btn_kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kayit= new Intent(MainActivity.this,kayitActivity.class);
                startActivity(kayit);
            }
        });


    }
}