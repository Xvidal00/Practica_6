package com.example.practica_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.ArrayList;
import java.util.List;

public class intentHotel extends AppCompatActivity implements OnItemSelectedListener {

    private ListView lista;

    String [][] datos4={
            {"Atenea","Magallanes/Aragón, s/n, 08401 Granollers, Barcelona","938794820"},
            {"Augusta","BP-5002, 13, 08410 Vilanova del Vallès, Barcelona","938456050"},
            {"Hotel Ciutat","Turo Bruguet, 2, 08402 Granollers, Barcelona","938796220"}
    };
    int[] datosImg4={R.drawable.atenea,R.drawable.augusta,R.drawable.hotelciutat};

    String [][] datos3={
            {"Hotel Granollers","A. Francesc Macià, 300, 08401 Granollers","938795100"},
            {"Holiday Inn Express Barcelona","C. de Pallars, 203, 08005 Barcelona"," 934338400"},
            {"Fonda Europa","C. d'Agustí Viñamata, 2, 08402 Granollers, Barcelona","938700312"}
    };
    int[] datosImg3={R.drawable.hotelgranollers,R.drawable.holiday,R.drawable.fondaeuropa};

    String [][] datos2={
            {"B&B Hotel","C. Valldoriolf, 1, 08520 Granollers, Barcelona","938407132"},
            {"Hotel Ibis","C. Can Catala, 08403 Granollers, Barcelona","935689060"},
            {"Hotel H","C. Masnou km 14, Granollers 08400, Barcelona","938606688"}
    };
    int[] datosImg2={R.drawable.hotelbb,R.drawable.hotelibis,R.drawable.hotelh};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_hotel);


        Spinner spinner = (Spinner) findViewById(R.id.spinner);



        spinner.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<String>();
        categories.add("2 Estrellas");
        categories.add("3 Estrellas");
        categories.add("4 Estrellas");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        if(item=="2 Estrellas")
        {
            lista= (ListView) findViewById(R.id.list);

            lista.setAdapter(new MyAdapter(this, datos2, datosImg2));
        }
        else if(item=="3 Estrellas")
        {
            lista= (ListView) findViewById(R.id.list);

            lista.setAdapter(new MyAdapter(this, datos3, datosImg3));
        }
        else if(item=="4 Estrellas")
        {
            lista= (ListView) findViewById(R.id.list);

            lista.setAdapter(new MyAdapter(this, datos4, datosImg4));
        }

        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();

    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}