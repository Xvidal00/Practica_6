package com.example.practica_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton hotels = findViewById(R.id.img3);
        ImageButton parking = findViewById(R.id.img4);

        hotels.setOnClickListener(this);
        parking.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        ImageButton aplicacion = (ImageButton) view;

        switch (aplicacion.getId())
        {
            case (R.id.img3):
                Intent intentH = new Intent(this,intentHotel.class);
                startActivity(intentH);
                ;break;

            case (R.id.img4):
                Intent intentP = new Intent(this,intentParking.class);
                startActivity(intentP);
                ;break;
        }

    }
}