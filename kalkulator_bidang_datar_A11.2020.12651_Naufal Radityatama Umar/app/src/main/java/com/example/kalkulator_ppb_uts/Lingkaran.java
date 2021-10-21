package com.example.kalkulator_bidang_datar;

import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
    private Button Lingkaran;
    private EditText Jari2;
    private TextView Luas;
    private TextView Keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        Lingkaran=findViewById(R.id.button_lingkaran);
        Luas=findViewById(R.id.luas_lingkaran);
        Keliling=findViewById(R.id.keliling_ligkaran);
        Jari2=findViewById(R.id.jari2);


        Lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = Jari2.getText().toString();

                if(nilai.isEmpty()){
                    Lingkaran.setError("Data Tidak Boleh Kosong");
                    Lingkaran.requestFocus();
                }
                else{
                    Integer Jari2 = Integer.parseInt(nilai);

                    Double luas = 3.14*(Jari2*Jari2);
                    Luas.setText(String.valueOf(luas));

                    Double keliling = 2*3.14*Jari2;
                    Keliling.setText(String.valueOf(keliling));
                }
            }
        });

//
//        Lingkaran.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                String nilai = Jari2.getText().toString();
//
//                if(nilai.isEmpty()){
//                    Lingkaran.setError("Data Tidak Boleh Kosong");
//                    Lingkaran.requestFocus();
//                }
//                else{
//                    Integer Jari2 = Integer.parseInt(nilai);
//
//                    Double luas = 3.14*(Jari2*Jari2);
//                    Luas.setText(String.valueOf(luas));
//
//                    Double keliling = 2*3.14*Jari2;
//                    Keliling.setText(String.valueOf(keliling));
//                }
//            }
//        });
    }
}