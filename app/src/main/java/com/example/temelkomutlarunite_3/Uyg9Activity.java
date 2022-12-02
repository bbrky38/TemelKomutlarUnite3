package com.example.temelkomutlarunite_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);

        EditText editSayi1 = findViewById(R.id.editNumber1);
        EditText editSayi2 = findViewById(R.id.editNumber2);
        Button btnHesapla = findViewById(R.id.btnHesapla);

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(editSayi1.getText().toString());
                int sayi2 = Integer.parseInt((editSayi2.getText().toString()));
                int x = 15;
                int y = 8;
                System.out.println("x ile y eşit mi : " + (x == y));
                System.out.println("x ile y farklı mı : " + (x != y));
                System.out.println("x, y’den büyük mü : " + (x > y));
                System.out.println("x, y’den küçük mü : " + (x < y));
                System.out.println("x, y’den büyük veya eşit mi : " + (x >= y));
                System.out.println("x, y’den küçük veya eşit mi : " + (x <= y));
            }
        });


    }
}
