package com.example.semana6ejemplo2;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentUno#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentUno extends Fragment {

    //Crear una instancia de View
    View view;
    //Crear objeto Button
    Button btnEventoFragment;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentUno() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentUno.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentUno newInstance(String param1, String param2) {
        FragmentUno fragment = new FragmentUno();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_uno, container, false);
        //Utilizar el view para poder hacer referencia a nuestro objeto boton
        btnEventoFragment = view.findViewById(R.id.btnEvento);

        //Crear evento setOnClickListener del boton
        btnEventoFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* //Agregar un AlertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Informacion");
                builder.setMessage("Usted esta usando un evento por medio de Fragment");
                builder.setPositiveButton("Aceptar",null);
                AlertDialog dialog = builder.create();
                dialog.show();*/

                //CARGAR UNA ACTIVITY
                Intent intent = new Intent(getActivity(),MainActivity2.class);
                getActivity().startActivity(intent);
            }
        });
        return view;
    }
}