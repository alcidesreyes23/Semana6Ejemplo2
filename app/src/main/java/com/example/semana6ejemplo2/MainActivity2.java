package com.example.semana6ejemplo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    FragmentUno fragmentUno;
    FragmentDos fragmentDos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fragmentUno = new FragmentUno();
        fragmentDos = new FragmentDos();

        getSupportFragmentManager().beginTransaction().add(R.id.frlContenedor,fragmentUno).commit();
    }

    public void onClick(View view){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (view.getId())
        {
            case R.id.btnFragmentUno:
                transaction.replace(R.id.frlContenedor,fragmentUno);
                transaction.addToBackStack(null);
                break;
            case R.id.btnFragmentDos:
                transaction.replace(R.id.frlContenedor,fragmentDos);
                break;
            case R.id.btnFragmentTres:
                transaction.replace(R.id.frlContenedor,fragmentUno);
                break;
            case R.id.btnFragmentCuatro:
                transaction.replace(R.id.frlContenedor,fragmentDos);
                break;
        }
        transaction.commit();
    }
}