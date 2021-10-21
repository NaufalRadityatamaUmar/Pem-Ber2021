package com.example.kalkulator_bidang_datar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {
    Button Segitiga;
    EditText Segitiga_alas;
    EditText Segitiga_tinggi;
    EditText Segitiga_sisi;
    TextView Luas;
    TextView Keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        Segitiga=findViewById(R.id.segitiga_button);
        Luas=findViewById(R.id.luas_segitiga);
        Keliling=findViewById(R.id.keliling_segitiga);
        Segitiga_alas=findViewById(R.id.segitiga_alas);
        Segitiga_tinggi=findViewById(R.id.segitiga_tinggi);
        Segitiga_sisi=findViewById(R.id.segitiga_sisi);
        Segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = Segitiga_alas.getText().toString();
                String nilai2 = Segitiga_tinggi.getText().toString();
                String nilai3 = Segitiga_sisi.getText().toString();

                if(nilai.isEmpty()){
                    Segitiga_alas.setError("Data Tidak Boleh Kosong");
                    Segitiga_alas.requestFocus();
                }
                else if (nilai2.isEmpty()){
                    Segitiga_tinggi.setError("Data Tidak Boleh Kosong");
                    Segitiga_tinggi.requestFocus();
                }
                else if (nilai3.isEmpty()){
                    Segitiga_sisi.setError("Data Tidak Boleh Kosong");
                    Segitiga_sisi.requestFocus();
                }
                else{
                    Double alas = Double.parseDouble(nilai);
                    Double tinggi = Double.parseDouble(nilai2);
                    Integer sisi = Integer.parseInt(nilai3);

                    Double luas = 0.5*(alas*tinggi);
                    Luas.setText(String.valueOf(luas));

                    Integer keliling = sisi+sisi+sisi;
                    Keliling.setText(String.valueOf(keliling));
                }
            }
        });
    }
}