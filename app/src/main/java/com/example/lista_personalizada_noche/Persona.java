package com.example.lista_personalizada_noche;

import android.widget.Toast;

public class Persona {
    String image;
    String firstName;
    String familyName;
    String email;
    String archivo_avatar; //Nombre del archivo dentro de los recursos

    enum Avatar { CABELLO_LARGO, GAFAS, GORRO, SOMBRERO }

    public Persona(String image, String firstName, String familyName, String email, Avatar avatar) {
        this.image = image;
        this.firstName = firstName;
        this.familyName = familyName;
        this.email = email;

        switch (avatar){
            case CABELLO_LARGO:
                archivo_avatar = "female2";
                break;
            case GAFAS:
                archivo_avatar = "female1";
                break;
            case GORRO:
                archivo_avatar = "male2";
                break;
            case SOMBRERO:
                archivo_avatar = "male1";
                break;
            default:
                archivo_avatar = "";
        }
    }
}
