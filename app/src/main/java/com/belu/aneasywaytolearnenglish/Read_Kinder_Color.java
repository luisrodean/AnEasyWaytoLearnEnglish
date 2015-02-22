package com.belu.aneasywaytolearnenglish;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;

import java.util.Locale;

/**
 * Created by Luis on 19/02/2015.
 */
public class Read_Kinder_Color extends Activity {

    private ImageButton red;
    private ImageButton orange;
    private ImageButton yellow;
    private ImageButton green;
    private ImageButton blue;
    private ImageButton white;
    private ImageButton gray;
    private ImageButton black;
    private ImageButton brown;
    private ImageButton purple;
    TextToSpeech ttobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_kinder_color);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        red =(ImageButton) findViewById(R.id.imb_Kind_Read_1);
        orange =(ImageButton) findViewById(R.id.imb_Kind_Read_2);
        yellow =(ImageButton) findViewById(R.id.imb_Kind_Read_3);
        green =(ImageButton) findViewById(R.id.imb_Kind_Read_4);
        blue =(ImageButton) findViewById(R.id.imb_Kind_Read_5);
        white =(ImageButton) findViewById(R.id.imb_Kind_Read_6);
        gray =(ImageButton) findViewById(R.id.imb_Kind_Read_7);
        black =(ImageButton) findViewById(R.id.imb_Kind_Read_8);
        brown =(ImageButton) findViewById(R.id.imb_Kind_Read_9);
        purple =(ImageButton) findViewById(R.id.imb_Kind_Read_10);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("red");
            }
        });
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("orange");
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("Yellow");
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("green");
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("blue");
            }
        });
        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("white");
            }
        });
        gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("gray");
            }
        });
        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("black");
            }
        });
        brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("brown");
            }
        });
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("purple");
            }
        });

        ttobj=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR){
                    ttobj.setLanguage(Locale.UK);
                }
            }
        });
    }

    @Override
    public void onPause(){
        if(ttobj !=null){
            ttobj.stop();
            ttobj.shutdown();
        }
        super.onPause();
    }
    private void Voz(String palabra){
        ttobj.speak(palabra, TextToSpeech.QUEUE_FLUSH, null);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
