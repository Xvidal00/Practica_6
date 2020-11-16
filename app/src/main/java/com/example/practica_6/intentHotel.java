package com.example.practica_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.List;

public class intentHotel extends AppCompatActivity implements View.OnClickListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_hotel);

        ImageButton hotel3 = findViewById(R.id.estrella3);
        ImageButton hotel4 = findViewById(R.id.estrella4);
        ImageButton hotel5 = findViewById(R.id.estrella5);

        hotel3.setOnClickListener(this);
        hotel4.setOnClickListener(this);
        hotel5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        ImageButton calificaccio = (ImageButton) view;

        switch (calificaccio.getId())
        {
            case (R.id.estrella3):
                Intent intentH = new Intent(this,hotelestrella3.class);
                startActivity(intentH);
                ;break;

            case (R.id.estrella4):
                Intent intentP = new Intent(this,intentParking.class);
                startActivity(intentP);
                ;break;

            case (R.id.estrella5):
                Intent intentE = new Intent(this,intentParking.class);
                startActivity(intentE);
                ;break;
        }

    }
}