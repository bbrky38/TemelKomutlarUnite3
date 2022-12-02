package com.example.temelkomutlarunite_3;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);

        final int PI =3;
        int yaricap = 2;
        int cevre = 2*PI*yaricap;

        System.out.println("Dairenin Çevresi:" + cevre);
    }
}

