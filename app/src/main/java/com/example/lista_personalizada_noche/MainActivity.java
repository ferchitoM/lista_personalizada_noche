package com.example.lista_personalizada_noche;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    ArrayList<Persona> miArray = new ArrayList<Persona>();
    AdapterListaPersonalizada adapter;

    Persona.Avatar avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.lista);
        llenarDatos();

    }

    private void llenarDatos(){

        miArray.add(new Persona("perfil1", "Paula", "Reyes López", "paulareyes@gmail.com", avatar.GAFAS));
        miArray.add(new Persona("perfil2", "Paula", "Reyes López", "paulareyes@gmail.com", avatar.SOMBRERO));
        miArray.add(new Persona("perfil3", "Paula", "Reyes López", "paulareyes@gmail.com", avatar.GORRO));
        miArray.add(new Persona("perfil4", "Paula", "Reyes López", "paulareyes@gmail.com", avatar.CABELLO_LARGO));

        adapter = new AdapterListaPersonalizada(this, miArray);
        lista.setAdapter(adapter);
    }
}