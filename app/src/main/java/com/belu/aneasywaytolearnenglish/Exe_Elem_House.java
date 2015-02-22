package com.belu.aneasywaytolearnenglish;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Luis on 19/02/2015.
 */
public class Exe_Elem_House extends Activity {

    private ImageButton next;
    private ImageView imagen;
    private TextView calificacion;
    private EditText title;
    private int contador = 1;
    private String tipo;
    private int aciertos =0;
    private int intentos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exe_elem_house);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        next =(ImageButton) findViewById(R.id.imb_elem_home_next);
        imagen =(ImageView) findViewById(R.id.img_home);
        title =(EditText) findViewById(R.id.tv_title);
        calificacion = (TextView) findViewById(R.id.tv_aciertos);

        tipo = getIntent().getStringExtra("Menu");

        switch (tipo){
            case "house":
                imagen.setImageResource(R.drawable.bedroom);
                break;
            case "HB":
                imagen.setImageResource(R.drawable.bodyhead);
                break;
            case "people":
                imagen.setImageResource(R.drawable.woman);
                break;
            case "animal":
                imagen.setImageResource(R.drawable.animalsdog);
                break;
            case "city":
                imagen.setImageResource(R.drawable.house1);
                break;
        }


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
                intentos++;
                title.setText("");
                switch (tipo){
                    case "house":
                        House(contador);
                        break;
                    case "HB":
                        HB(contador);
                        break;
                    case "people":
                        Pep(contador);
                        break;
                    case "animal":
                        animal(contador);
                        break;
                    case "city":
                        city(contador);
                        break;
                }

            }
        });
    }

    private void House(int contador){
        switch (contador){
            case 1:
                imagen.setImageResource(R.drawable.bedroom);
                if(title.getText().toString().equals("Bedroom")){
                    aciertos++;
                }
                break;
            case 2:
                imagen.setImageResource(R.drawable.livingroom);
                if(title.getText().toString().equals("Living Room")) {
                    aciertos++;
                }
                break;
            case 3:
                imagen.setImageResource(R.drawable.kitchen);
                if(title.getText().toString().equals("Kitchen")) {
                    aciertos++;
                }
                break;
            case 4:
                imagen.setImageResource(R.drawable.bathroom);
                if(title.getText().toString().equals("Bathroom")) {
                    aciertos++;
                }
                break;
            case 5:
                imagen.setImageResource(R.drawable.garden);
                if(title.getText().toString().equals("Garden")) {
                    aciertos++;
                }
                break;
            case 6:
                imagen.setImageResource(R.drawable.housegarage);
                if(calificacion.getText().toString().equals("Garage")) {
                    aciertos++;
                }
                break;
            case 7:
                imagen.setImageResource(R.drawable.housebasement);
                if(title.getText().toString().equals("Basement")) {
                    aciertos++;
                }
                break;
            case 8:
                imagen.setImageResource(R.drawable.roof);
                if(title.getText().toString().equals("Roof")) {
                    aciertos++;
                }
                break;
            case 9:
                imagen.setImageResource(R.drawable.diningroom);
                if(title.getText().toString().equals("Dining Room")) {
                    aciertos++;
                }
                break;
            case 10:
                imagen.setImageResource(R.drawable.attic);
                if(title.getText().toString().equals("Attic")) {
                    aciertos++;
                }
                break;
            default:
                this.contador=0;
                break;
        }
        calificacion.setText("Has logrado "+ aciertos +" correctos de "+intentos);
    }
    private void HB(int contador){
        switch (contador){
            case 1:
                imagen.setImageResource(R.drawable.bodyhead);
                if(title.getText().toString().equals("Head")) {
                    aciertos++;
                }
                break;
            case 2:
                imagen.setImageResource(R.drawable.neck);
                if(title.getText().toString().equals("Neck")) {
                    aciertos++;
                }
                break;
            case 3:
                imagen.setImageResource(R.drawable.ephand);
                if(title.getText().toString().equals("Hand")) {
                    aciertos++;
                }
                break;
            case 4:
                imagen.setImageResource(R.drawable.arm);
                if(title.getText().toString().equals("Arm")) {
                    aciertos++;
                }
                break;
            case 5:
                imagen.setImageResource(R.drawable.leg);
                if(title.getText().toString().equals("Leg")) {
                    aciertos++;
                }
                break;
            case 6:
                imagen.setImageResource(R.drawable.toe);
                if(title.getText().toString().equals("Toe")) {
                    aciertos++;
                }
                break;
            case 7:
                imagen.setImageResource(R.drawable.fingers);
                if(title.getText().toString().equals("Fingers")) {
                aciertos++;
            }
                break;
            case 8:
                imagen.setImageResource(R.drawable.eyes);
                if(title.getText().toString().equals("Eyes")) {
                aciertos++;
            }
                break;
            case 9:
                imagen.setImageResource(R.drawable.nose);
                if(title.getText().toString().equals("Nose")) {
                    aciertos++;
                }
                break;
            case 10:
                imagen.setImageResource(R.drawable.ear);
                if(title.getText().toString().equals("Ear")) {
                    aciertos++;
                }
                break;
            default:
                this.contador=0;
                break;
        }
        calificacion.setText("Has logrado "+ aciertos +" correctos de "+intentos);
    }
    private void Pep(int contador){
        switch (contador){
            case 1:
                imagen.setImageResource(R.drawable.woman);
                if(title.getText().toString().equals("Woman")) {
                    aciertos++;
                }
                break;
            case 2:
                imagen.setImageResource(R.drawable.man);
                if(title.getText().toString().equals("Man")) {
                    aciertos++;
                }
                break;
            case 3:
                imagen.setImageResource(R.drawable.girl);
                if(title.getText().toString().equals("Girl")) {
                    aciertos++;
                }
                break;
            case 4:
                imagen.setImageResource(R.drawable.boy);
                if(title.getText().toString().equals("Boy")) {
                    aciertos++;
                }
                break;
            case 5:
                imagen.setImageResource(R.drawable.student);
                if(title.getText().toString().equals("Student")) {
                    aciertos++;
                }
                break;
            case 6:
                imagen.setImageResource(R.drawable.peoplecop);
                if(title.getText().toString().equals("Cop/Policeman")) {
                    aciertos++;
                }
                break;
            case 7:
                imagen.setImageResource(R.drawable.firefighter);
                if(title.getText().toString().equals("Firefighter")) {
                    aciertos++;
                }
                break;
            case 8:
                imagen.setImageResource(R.drawable.nurse);
                if(title.getText().toString().equals("Nurse")) {
                    aciertos++;
                }
                break;
            case 9:
                imagen.setImageResource(R.drawable.worker);
                if(title.getText().toString().equals("Worker")) {
                    aciertos++;
                }
                break;
            case 10:
                imagen.setImageResource(R.drawable.engineer);
                if(title.getText().toString().equals("Engineer")) {
                    aciertos++;
                }
                break;
            default:
                this.contador=0;
                break;
        }
        calificacion.setText("Has logrado "+ aciertos +" correctos de "+intentos);
    }
    private void animal(int contador){
        switch (contador){
            case 1:
                imagen.setImageResource(R.drawable.animalsdog);
                if(title.getText().toString().equals("Dog")) {
                    aciertos++;
                }
                break;
            case 2:
                imagen.setImageResource(R.drawable.cat);
                if(title.getText().toString().equals("Cat")) {
                    aciertos++;
                }
                break;
            case 3:
                imagen.setImageResource(R.drawable.elephant);
                if(title.getText().toString().equals("Elephant")) {
                    aciertos++;
                }
                break;
            case 4:
                imagen.setImageResource(R.drawable.giraffe);
                if(title.getText().toString().equals("Giraffe")) {
                    aciertos++;
                }
                break;
            case 5:
                imagen.setImageResource(R.drawable.rat);
                if(title.getText().toString().equals("Rat")) {
                    aciertos++;
                }
                break;
            case 6:
                imagen.setImageResource(R.drawable.canary);
                if(title.getText().toString().equals("Canary")) {
                    aciertos++;
                }
                break;
            case 7:
                imagen.setImageResource(R.drawable.parrot);
                if(title.getText().toString().equals("Parrot")) {
                    aciertos++;
                }
                break;
            case 8:
                imagen.setImageResource(R.drawable.ferret);
                if(title.getText().toString().equals("Ferret")) {
                    aciertos++;
                }
                break;
            case 9:
                imagen.setImageResource(R.drawable.monkey);
                if(title.getText().toString().equals("Monkey")) {
                    aciertos++;
                }
                break;
            case 10:
                imagen.setImageResource(R.drawable.crocodile);
                if(title.getText().toString().equals("Crocodile")) {
                    aciertos++;
                }
                break;
            default:
                this.contador=0;
                break;
        }
        calificacion.setText("Has logrado "+ aciertos +" correctos de "+intentos);
    }
    private void city(int contador){
        switch (contador){
            case 1:
                imagen.setImageResource(R.drawable.house1);
                if(title.getText().toString().equals("House")) {
                    aciertos++;
                }
                break;
            case 2:
                imagen.setImageResource(R.drawable.building);
                if(title.getText().toString().equals("Building")) {
                    aciertos++;
                }
                break;
            case 3:
                imagen.setImageResource(R.drawable.citypark);
                if(title.getText().toString().equals("Park")) {
                    aciertos++;
                }
                break;
            case 4:
                imagen.setImageResource(R.drawable.supermaket);
                if(title.getText().toString().equals("Supermarket")) {
                    aciertos++;
                }
                break;
            case 5:
                imagen.setImageResource(R.drawable.mall);
                if(title.getText().toString().equals("Mall")) {
                    aciertos++;
                }
                break;
            case 6:
                imagen.setImageResource(R.drawable.trainstation);
                if(title.getText().toString().equals("Train Station")) {
                    aciertos++;
                }
                break;
            case 7:
                imagen.setImageResource(R.drawable.cinema);
                if(title.getText().toString().equals("Cinema")) {
                    aciertos++;
                }
                break;
            case 8:
                imagen.setImageResource(R.drawable.theatre);
                if(title.getText().toString().equals("Theatre")) {
                    aciertos++;
                }
                break;
            case 9:
                imagen.setImageResource(R.drawable.school);
                if(title.getText().toString().equals("School")) {
                    aciertos++;
                }
                break;
            case 10:
                imagen.setImageResource(R.drawable.factory);
                if(title.getText().toString().equals("Factory")) {
                    aciertos++;
                }
                break;
            default:
                this.contador=0;
                break;
        }
        calificacion.setText("Has logrado "+ aciertos +" correctos de "+intentos);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
