package com.belu.aneasywaytolearnenglish;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Luis on 19/02/2015.
 */
public class Exe_Kinder_Num extends Activity {

    private EditText one;
    private EditText two;
    private EditText three;
    private EditText four;
    private EditText five;
    private EditText six;
    private EditText seven;
    private EditText eight;
    private EditText nine;
    private EditText ten;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_kinder_num);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        one =(EditText) findViewById(R.id.txt_kinder_color1);
        two =(EditText) findViewById(R.id.txt_kinder_color2);
        three =(EditText) findViewById(R.id.txt_kinder_color3);
        four =(EditText) findViewById(R.id.txt_kinder_color4);
        five =(EditText) findViewById(R.id.txt_kinder_color5);
        six =(EditText) findViewById(R.id.txt_kinder_color6);
        seven =(EditText) findViewById(R.id.txt_kinder_color7);
        eight =(EditText) findViewById(R.id.txt_kinder_color8);
        nine =(EditText) findViewById(R.id.txt_kinder_color9);
        ten =(EditText) findViewById(R.id.txt_kinder_color10);
        btnAceptar = (Button) findViewById(R.id.button);


        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aceptar();
            }


        });

    }

        private void Aceptar(){
            String numero[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
            String Numero[] = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
            String NUMERO[] = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN"};
            int correcto=0;

            if(one.getText().toString().equals(numero[0]) || one.getText().toString().equals(Numero[0]) || one.getText().toString().equals(NUMERO[0])){
                correcto++;
            }
            if(two.getText().toString().equals(numero[1]) || two.getText().toString().equals(Numero[1]) || two.getText().toString().equals(NUMERO[1])){
                correcto++;
            }
            if(three.getText().toString().equals(numero[2]) || three.getText().toString().equals(Numero[2]) || three.getText().toString().equals(NUMERO[2])){
                correcto++;
            }
            if(four.getText().toString().equals(numero[3]) || four.getText().toString().equals(Numero[3]) || four.getText().toString().equals(NUMERO[3])){
                correcto++;
            }
            if(five.getText().toString().equals(numero[4]) || five.getText().toString().equals(Numero[4]) || five.getText().toString().equals(NUMERO[4])){
                correcto++;
            }
            if(six.getText().toString().equals(numero[5]) || six.getText().toString().equals(Numero[5]) || six.getText().toString().equals(NUMERO[5])){
                correcto++;
            }
            if(seven.getText().toString().equals(numero[6]) || seven.getText().toString().equals(Numero[6]) || seven.getText().toString().equals(NUMERO[6])){
                correcto++;
            }
            if(eight.getText().toString().equals(numero[7]) || eight.getText().toString().equals(Numero[7]) || eight.getText().toString().equals(NUMERO[7])){
                correcto++;
            }
            if(nine.getText().toString().equals(numero[8]) || nine.getText().toString().equals(Numero[8]) || nine.getText().toString().equals(NUMERO[8])){
                correcto++;
            }
            if(ten.getText().toString().equals(numero[9]) || ten.getText().toString().equals(Numero[9]) || ten.getText().toString().equals(NUMERO[9])){
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
