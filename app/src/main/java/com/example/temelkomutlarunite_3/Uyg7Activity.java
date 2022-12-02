package com.example.temelkomutlarunite_3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Activity extends AppCompatActivity {
    @Override


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        EditText sayi1 = findViewById(R.id.editNumber1);
        EditText sayi2 = findViewById(R.id.editNumber2);
        Button btnHesapla = findViewById(R.id.btnHesapla);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);

        int x = 10;
        int y = 3;
        int toplam = x + y;
        int fark = x - y;
        int carpim = x * y;
        int bolme = x / y;
        int mod = x % y;
        x++;
        y--;
        System.out.println("Toplam:" + toplam);
        System.out.println("Fark:" + fark);
        System.out.println("Çarpım:" + carpim);
        System.out.println("Bölme:" + bolme);
        System.out.println("Mod Alma:" + mod);
        System.out.println("Artırma:" + x);
        System.out.println("Azaltma:" + y);

    }
}
