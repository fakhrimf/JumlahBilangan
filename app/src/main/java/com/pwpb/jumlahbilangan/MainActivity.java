package com.pwpb.jumlahbilangan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bil2;
    private TextView hasil;
    private Button btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI() {
        bil1 = findViewById(R.id.edtBil1);
        bil2 = findViewById(R.id.edtBil2);
        hasil = findViewById(R.id.edtHasil);
        btnHasil = findViewById(R.id.btnHasil);
    }

    private void initEvent() {
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungHasil();
            }
        });
    }

    private void hitungHasil() {
        String bilangan1 = bil1.getText().toString();
        String bilangan2 = bil2.getText().toString();
        int angka1 = Integer.parseInt(bilangan1);
        int angka2 = Integer.parseInt(bilangan2);
        hasil.setText(angka1 + angka2 + "");
    }
}
