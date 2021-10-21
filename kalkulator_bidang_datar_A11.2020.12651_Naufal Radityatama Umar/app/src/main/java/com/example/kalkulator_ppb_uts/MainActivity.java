package com.example.kalkulator_bidang_datar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Persegi;
    Button Segitiga;
    Button Lingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Persegi=findViewById(R.id.persegi);
        Segitiga=findViewById(R.id.segitiga);
        Lingkaran=findViewById(R.id.lingkaran);

        Persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Persegi.class));
            }
        });

        Segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Segitiga.class));
            }
        });

        Lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Lingkaran.class));
            }
        });

    }
}