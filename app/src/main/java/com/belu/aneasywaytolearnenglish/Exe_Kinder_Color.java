package com.belu.aneasywaytolearnenglish;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Luis on 19/02/2015.
 */
public class Exe_Kinder_Color extends Activity {

    private EditText red;
    private EditText orange;
    private EditText yellow;
    private EditText green;
    private EditText blue;
    private EditText white;
    private EditText gray;
    private EditText black;
    private EditText brown;
    private EditText purple;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_kinder_color);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        red =(EditText) findViewById(R.id.txt_kinder_color1);
        orange =(EditText) findViewById(R.id.txt_kinder_color2);
        yellow =(EditText) findViewById(R.id.txt_kinder_color3);
        green =(EditText) findViewById(R.id.txt_kinder_color4);
        blue =(EditText) findViewById(R.id.txt_kinder_color5);
        white =(EditText) findViewById(R.id.txt_kinder_color6);
        gray =(EditText) findViewById(R.id.txt_kinder_color7);
        black =(EditText) findViewById(R.id.txt_kinder_color8);
        brown =(EditText) findViewById(R.id.txt_kinder_color9);
        purple =(EditText) findViewById(R.id.txt_kinder_color10);
        btnAceptar = (Button) findViewById(R.id.button);


        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aceptar();
            }


        });

    }

        private void Aceptar(){
            String color[] = {"red", "orange", "yellow", "green", "blue", "white", "gray", "black", "brown", "purple"};
            String Color[] = {"Red", "Orange", "Yellow", "Green", "Blue", "White", "Gray", "Black", "Brown", "Purple"};
            String COLOR[] = {"RED", "ORANGE", "YELLOW", "GREEN", "BLUE", "WHITE", "GRAY", "BLACK", "BROWN", "PURPLE"};
            int correcto=0;

            if(red.getText().toString().equals(color[0]) || red.getText().toString().equals(Color[0]) || red.getText().toString().equals(COLOR[0])){
                correcto++;
            }
            if(orange.getText().toString().equals(color[1]) || orange.getText().toString().equals(Color[1]) || orange.getText().toString().equals(COLOR[1])){
                correcto++;
            }
            if(yellow.getText().toString().equals(color[2]) || yellow.getText().toString().equals(Color[2]) || yellow.getText().toString().equals(COLOR[2])){
                correcto++;
            }
            if(green.getText().toString().equals(color[3]) || green.getText().toString().equals(Color[3]) || green.getText().toString().equals(COLOR[3])){
                correcto++;
            }
            if(blue.getText().toString().equals(color[4]) || blue.getText().toString().equals(Color[4]) || blue.getText().toString().equals(COLOR[4])){
                correcto++;
            }
            if(white.getText().toString().equals(color[5]) || white.getText().toString().equals(Color[5]) || white.getText().toString().equals(COLOR[5])){
                correcto++;
            }
            if(gray.getText().toString().equals(color[6]) || gray.getText().toString().equals(Color[6]) || gray.getText().toString().equals(COLOR[6])){
                correcto++;
            }
            if(black.getText().toString().equals(color[7]) || black.getText().toString().equals(Color[7]) || black.getText().toString().equals(COLOR[7])){
                correcto++;
            }
            if(brown.getText().toString().equals(color[8]) || brown.getText().toString().equals(Color[8]) || brown.getText().toString().equals(COLOR[8])){
                correcto++;
            }
            if(purple.getText().toString().equals(color[9]) || purple.getText().toString().equals(Color[9]) || purple.getText().toString().equals(COLOR[9])){
                correcto++;
            }
            dialogo(correcto);
        }

    private void dialogo(int Correcto){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¡ Haz obtenido " + Correcto + " respuestas correctas de 10 !")
                .setTitle("Resultados")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //Cierra el Dialogo
                        dialog.cancel();

                        finish();
                    }
                });
        builder.show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        finish();
    }
}
