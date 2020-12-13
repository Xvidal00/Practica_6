package com.example.practica_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class intentParking extends AppCompatActivity {


    private ListView lista02;

    String [][] datos={
            {"Pàrquing Escolapi Blau","C. Francisco de Quevedo, 08402 Granollers, Barcelona","Places: 10/40"},
            {"Pàrquing el Sot","Plaça Josep Barangé Bachs, 08402 Granollers, Barcelona","Places: 1/20"},
            {"Parking Estació-Atenea","Passeig Cristòfol Colom, 21, 08402 Granollers, Barcelona","Places: 22/50"}
    };

    int[] datosImg={R.drawable.blau,R.drawable.parkingsot,R.drawable.estacioatenea};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_parking);

        lista02= (ListView) findViewById(R.id.list2);

        lista02.setAdapter(new MyAdapter02(this, datos, datosImg));

    }
}