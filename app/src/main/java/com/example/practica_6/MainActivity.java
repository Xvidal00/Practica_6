package com.example.practica_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton restaurant = findViewById(R.id.img1);
        ImageButton transport = findViewById(R.id.img2);
        ImageButton hotel = findViewById(R.id.img3);
        ImageButton parking = findViewById(R.id.img4);
        ImageButton negocis = findViewById(R.id.img5);
        ImageButton movies = findViewById(R.id.img6);

        restaurant.setOnClickListener(this);
        transport.setOnClickListener(this);
        hotel.setOnClickListener(this);
        parking.setOnClickListener(this);
        negocis.setOnClickListener(this);
        movies.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        ImageView obrir = (ImageView) view;

        if(obrir.getId()== R.id.img1) //RESTAURANT CAMBIAR
        {
            Intent RESTAURANT = new Intent(this,MainActivity.class);
            startActivity(RESTAURANT);
        }
        else if(obrir.getId()== R.id.img2) //TRANSPORT CAMBIAR
        {
            Intent TRANSPORT = new Intent(this,MainActivity.class);
            startActivity(TRANSPORT);
        }
        else if(obrir.getId()== R.id.img3) //HOTEL
        {
            Intent HOTEL = new Intent(this,intentHotel.class);
            startActivity(HOTEL);
        }
        else if(obrir.getId()== R.id.img4) //PARKING
        {
            Intent PARKING = new Intent(this,intentParking.class);
            startActivity(PARKING);
        }
        else if(obrir.getId()== R.id.img5) //NEGOCIS CAMBIAR
        {
            Intent NEGOCIS = new Intent(this,MainActivity.class);
            startActivity(NEGOCIS);
        }
        else if(obrir.getId()== R.id.img6) //MOVIES CAMBIAR
        {
            Intent MOVIES = new Intent(this,MainActivity.class);
            startActivity(MOVIES);
        }

    }
}