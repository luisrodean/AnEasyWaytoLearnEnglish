package com.belu.aneasywaytolearnenglish;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

/**
 * Created by Luis on 19/02/2015.
 */
public class Read_Elem_House extends Activity {

    private ImageButton next;
    private ImageView imagen;
    private TextView title;
    private int contador = 1;
    private String tipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_elem_house);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        next =(ImageButton) findViewById(R.id.imb_elem_home_next);
        imagen =(ImageView) findViewById(R.id.img_home);
        title =(TextView) findViewById(R.id.tv_title);

        tipo = getIntent().getStringExtra("Menu");

        switch (tipo){
            case "house":
                imagen.setImageResource(R.drawable.bedroom);
                title.setText("Bedroom");
                break;
            case "HB":
                imagen.setImageResource(R.drawable.bodyhead);
                title.setText("Head");
                break;
            case "people":
                imagen.setImageResource(R.drawable.woman);
                title.setText("Woman");
                break;
            case "animal":
                imagen.setImageResource(R.drawable.animalsdog);
                title.setText("Dog");
                break;
            case "city":
                imagen.setImageResource(R.drawable.house1);
                title.setText("House");
                break;
        }


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;
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
                title.setText("Bedroom");
                break;
            case 2:
                imagen.setImageResource(R.drawable.livingroom);
                title.setText("Living Room");
                break;
            case 3:
                imagen.setImageResource(R.drawable.kitchen);
                title.setText("Kitchen");
                break;
            case 4:
                imagen.setImageResource(R.drawable.bathroom);
                title.setText("Bathroom");
                break;
            case 5:
                imagen.setImageResource(R.drawable.garden);
                title.setText("Garden");
                break;
            case 6:
                imagen.setImageResource(R.drawable.housegarage);
                title.setText("Garage");
                break;
            case 7:
                imagen.setImageResource(R.drawable.housebasement);
                title.setText("Basement");
                break;
            case 8:
                imagen.setImageResource(R.drawable.roof);
                title.setText("Roof");
                break;
            case 9:
                imagen.setImageResource(R.drawable.diningroom);
                title.setText("Dining Room");
                break;
            case 10:
                imagen.setImageResource(R.drawable.attic);
                title.setText("Attic");
                break;
            default:
                this.contador=0;
                break;
        }
    }
    private void HB(int contador){
        switch (contador){
            case 1:
                imagen.setImageResource(R.drawable.bodyhead);
                title.setText("Head");
                break;
            case 2:
                imagen.setImageResource(R.drawable.neck);
                title.setText("Neck");
                break;
            case 3:
                imagen.setImageResource(R.drawable.ephand);
                title.setText("Hand");
                break;
            case 4:
                imagen.setImageResource(R.drawable.arm);
                title.setText("Arm");
                break;
            case 5:
                imagen.setImageResource(R.drawable.leg);
                title.setText("Leg");
                break;
            case 6:
                imagen.setImageResource(R.drawable.toe);
                title.setText("Toe");
                break;
            case 7:
                imagen.setImageResource(R.drawable.fingers);
                title.setText("Fingers");
                break;
            case 8:
                imagen.setImageResource(R.drawable.eyes);
                title.setText("Eyes");
                break;
            case 9:
                imagen.setImageResource(R.drawable.nose);
                title.setText("Nose");
                break;
            case 10:
                imagen.setImageResource(R.drawable.ear);
                title.setText("Ear");
                break;
            default:
                this.contador=0;
                break;
        }
    }
    private void Pep(int contador){
        switch (contador){
            case 1:
                imagen.setImageResource(R.drawable.woman);
                title.setText("Woman");
                break;
            case 2:
                imagen.setImageResource(R.drawable.man);
                title.setText("Man");
                break;
            case 3:
                imagen.setImageResource(R.drawable.girl);
                title.setText("Girl");
                break;
            case 4:
                imagen.setImageResource(R.drawable.boy);
                title.setText("Boy");
                break;
            case 5:
                imagen.setImageResource(R.drawable.student);
                title.setText("Student");
                break;
            case 6:
                imagen.setImageResource(R.drawable.peoplecop);
                title.setText("Cop/Policeman");
                break;
            case 7:
                imagen.setImageResource(R.drawable.firefighter);
                title.setText("Firefighter");
                break;
            case 8:
                imagen.setImageResource(R.drawable.nurse);
                title.setText("Nurse");
                break;
            case 9:
                imagen.setImageResource(R.drawable.worker);
                title.setText("Worker");
                break;
            case 10:
                imagen.setImageResource(R.drawable.engineer);
                title.setText("Engineer");
                break;
            default:
                this.contador=0;
                break;
        }
    }
    private void animal(int contador){
        switch (contador){
            case 1:
                imagen.setImageResource(R.drawable.animalsdog);
                title.setText("Dog");
                break;
            case 2:
                imagen.setImageResource(R.drawable.cat);
                title.setText("Cat");
                break;
            case 3:
                imagen.setImageResource(R.drawable.elephant);
                title.setText("Elephant");
                break;
            case 4:
                imagen.setImageResource(R.drawable.giraffe);
                title.setText("Giraffe");
                break;
            case 5:
                imagen.setImageResource(R.drawable.rat);
                title.setText("Rat");
                break;
            case 6:
                imagen.setImageResource(R.drawable.canary);
                title.setText("Canary");
                break;
            case 7:
                imagen.setImageResource(R.drawable.parrot);
                title.setText("Parrot");
                break;
            case 8:
                imagen.setImageResource(R.drawable.ferret);
                title.setText("Ferret");
                break;
            case 9:
                imagen.setImageResource(R.drawable.monkey);
                title.setText("Monkey");
                break;
            case 10:
                imagen.setImageResource(R.drawable.crocodile);
                title.setText("Crocodile");
                break;
            default:
                this.contador=0;
                break;
        }
    }
    private void city(int contador){
        switch (contador){
            case 1:
                imagen.setImageResource(R.drawable.house1);
                title.setText("House");
                break;
            case 2:
                imagen.setImageResource(R.drawable.building);
                title.setText("Building");
                break;
            case 3:
                imagen.setImageResource(R.drawable.citypark);
                title.setText("Park");
                break;
            case 4:
                imagen.setImageResource(R.drawable.supermaket);
                title.setText("Supermarket");
                break;
            case 5:
                imagen.setImageResource(R.drawable.mall);
                title.setText("Mall");
                break;
            case 6:
                imagen.setImageResource(R.drawable.trainstation);
                title.setText("Train Station");
                break;
            case 7:
                imagen.setImageResource(R.drawable.cinema);
                title.setText("Cinema");
                break;
            case 8:
                imagen.setImageResource(R.drawable.theatre);
                title.setText("Theatre");
                break;
            case 9:
                imagen.setImageResource(R.drawable.school);
                title.setText("School");
                break;
            case 10:
                imagen.setImageResource(R.drawable.factory);
                title.setText("Factory");
                break;
            default:
                this.contador=0;
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
