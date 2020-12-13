package com.example.practica_6;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context context;
    String[][] datos;
    int[] datosimg;

    public MyAdapter(Context context, String[][] datos, int[] imagenes) {
        this.context = context;
        this.datos = datos;
        this.datosimg = imagenes;

        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return datosimg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override

    public View getView(int i, View convertView, ViewGroup viewGroup) {

        final View vista = inflater.inflate(R.layout.list_item,null);

        TextView nomHotel = (TextView)vista.findViewById(R.id.nomHotel);
        TextView direccio = (TextView)vista.findViewById(R.id.direccio);
        TextView telefon = (TextView)vista.findViewById(R.id.telefon);

        final ImageView hotelImg = (ImageView) vista.findViewById(R.id.hotelIMG);

        nomHotel.setText(datos[i][0]);
        direccio.setText(datos[i][1]);
        telefon.setText(datos[i][2]);

        hotelImg.setImageResource(datosimg[i]);
        hotelImg.setTag(datos[i][2]);

        hotelImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s= (String) hotelImg.getTag();
                if(s.length()==9)
                {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+s));
                    context.startActivity(intent);
                }

            }
        });
        return vista;

    }

}