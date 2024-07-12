package com.example.lista_personalizada_noche;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterListaPersonalizada extends ArrayAdapter<Persona> {

    LayoutInflater inflater;
    Context context;

    public AdapterListaPersonalizada(Context context, ArrayList<Persona> miArray){
        super(context, 0, miArray);
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        convertView         = inflater.inflate(R.layout.lista_personalizada, null);

        ImageView image     = convertView.findViewById(R.id.image);
        TextView firstName  = convertView.findViewById(R.id.firt_name);
        TextView familyName = convertView.findViewById(R.id.family_name);
        TextView email      = convertView.findViewById(R.id.email);
        ImageView avatar    = convertView.findViewById(R.id.avatar);

        Persona item = getItem(position);

        int idRecurso = context.getResources().getIdentifier(item.image, "drawable", context.getPackageName());
        image.setImageResource(idRecurso);

        idRecurso = context.getResources().getIdentifier(item.archivo_avatar, "drawable", context.getPackageName());
        avatar.setImageResource(idRecurso);

        firstName.setText(item.firstName);
        familyName.setText(item.familyName);
        email.setText(item.email);

        return convertView;
    }

}
