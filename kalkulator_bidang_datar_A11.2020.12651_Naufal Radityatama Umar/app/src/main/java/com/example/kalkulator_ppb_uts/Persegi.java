package com.example.kalkulator_bidang_datar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends AppCompatActivity {

    Button Persegi;
    EditText Sisi;
    TextView Luas;
    TextView Keliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        Persegi = findViewById(R.id.kotak_button);
        Luas = findViewById(R.id.tampilan_luas);
        Keliling = findViewById(R.id.tampilan_keliling);
        Sisi = findViewById(R.id.kotak);
        Persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = Sisi.getText().toString();

                if(nilai.isEmpty()){
                    Persegi.setError("Data Tidak Boleh Kosong");
                    Persegi.requestFocus();
                }
                else{
                    Integer sisi = Integer.parseInt(nilai);

                    Integer luas = sisi*sisi;
                    Luas.setText(String.valueOf(luas));

                    Integer keliling = sisi+sisi+sisi+sisi;
                    Keliling.setText(String.valueOf(keliling));
                }
            }
        });
    }
}