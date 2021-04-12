package com.example.semana6ejemplo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentUno fragmentUno;
    FragmentDos fragmentDos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentUno = new FragmentUno();
        fragmentDos = new FragmentDos();

        getSupportFragmentManager().
                beginTransaction().
                add(R.id.frlContenedor,fragmentUno).
                commit();
    }

    //Agregando método onClick de los botones
    public void onClick(View view){
        //Iniciar la transaccion para los fragments
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        //Evaluar por su ID a que botón se la dio clic
        switch(view.getId()){
            case R.id.btnUno:
                //Remplazar el contenido del FrameLayout actual por nuestro fragment
                transaction.replace(R.id.frlContenedor,fragmentUno);
                transaction.addToBackStack(null);
                break;
            case R.id.btnDos:
                //Remplazar el contenido del FrameLayout actual por nuestro fragment
                transaction.replace(R.id.frlContenedor,fragmentDos);
                transaction.addToBackStack(null);
                break;
        }//Fin de switch
        //Confirmar la transacción
        transaction.commit();
    }//Fin de onClick

}