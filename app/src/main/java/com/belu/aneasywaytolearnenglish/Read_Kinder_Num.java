package com.belu.aneasywaytolearnenglish;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;

import java.util.Locale;

/**
 * Created by Luis on 19/02/2015.
 */
public class Read_Kinder_Num extends Activity {

    private ImageButton one;
    private ImageButton two;
    private ImageButton three;
    private ImageButton four;
    private ImageButton five;
    private ImageButton six;
    private ImageButton seven;
    private ImageButton eight;
    private ImageButton nine;
    private ImageButton ten;
    TextToSpeech ttobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_kinder_num);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        one =(ImageButton) findViewById(R.id.imb_Kind_Read_1);
        two =(ImageButton) findViewById(R.id.imb_Kind_Read_2);
        three =(ImageButton) findViewById(R.id.imb_Kind_Read_3);
        four =(ImageButton) findViewById(R.id.imb_Kind_Read_4);
        five =(ImageButton) findViewById(R.id.imb_Kind_Read_5);
        six =(ImageButton) findViewById(R.id.imb_Kind_Read_6);
        seven =(ImageButton) findViewById(R.id.imb_Kind_Read_7);
        eight =(ImageButton) findViewById(R.id.imb_Kind_Read_8);
        nine =(ImageButton) findViewById(R.id.imb_Kind_Read_9);
        ten =(ImageButton) findViewById(R.id.imb_Kind_Read_10);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("one");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("two");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("three");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("four");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("five");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("six");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("seven");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("eight");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("nine");
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("ten");
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
