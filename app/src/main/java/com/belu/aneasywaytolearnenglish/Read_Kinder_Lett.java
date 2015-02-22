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
public class Read_Kinder_Lett extends Activity {

    private ImageButton a;
    private ImageButton b;
    private ImageButton c;
    private ImageButton d;
    private ImageButton e;
    private ImageButton f;
    private ImageButton g;
    private ImageButton h;
    private ImageButton i;
    private ImageButton j;
    private ImageButton k;
    private ImageButton l;
    private ImageButton m;
    private ImageButton n;
    private ImageButton o;
    private ImageButton p;
    private ImageButton q;
    private ImageButton r;
    private ImageButton s;
    private ImageButton t;
    private ImageButton u;
    private ImageButton v;
    private ImageButton w;
    private ImageButton x;
    private ImageButton y;
    private ImageButton z;
    TextToSpeech ttobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_kinder_let);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        a =(ImageButton) findViewById(R.id.imb_Kind_Read_1);
        b =(ImageButton) findViewById(R.id.imb_Kind_Read_2);
        c =(ImageButton) findViewById(R.id.imb_Kind_Read_3);
        d =(ImageButton) findViewById(R.id.imb_Kind_Read_4);
        e =(ImageButton) findViewById(R.id.imb_Kind_Read_5);
        f =(ImageButton) findViewById(R.id.imb_Kind_Read_6);
        g =(ImageButton) findViewById(R.id.imb_Kind_Read_7);
        h =(ImageButton) findViewById(R.id.imb_Kind_Read_8);
        i =(ImageButton) findViewById(R.id.imb_Kind_Read_9);
        j =(ImageButton) findViewById(R.id.imb_Kind_Read_10);
        k =(ImageButton) findViewById(R.id.imb_Kind_Read_11);
        l =(ImageButton) findViewById(R.id.imb_Kind_Read_12);
        m =(ImageButton) findViewById(R.id.imb_Kind_Read_13);
        n =(ImageButton) findViewById(R.id.imb_Kind_Read_14);
        o =(ImageButton) findViewById(R.id.imb_Kind_Read_15);
        p =(ImageButton) findViewById(R.id.imb_Kind_Read_16);
        q =(ImageButton) findViewById(R.id.imb_Kind_Read_17);
        r =(ImageButton) findViewById(R.id.imb_Kind_Read_18);
        s =(ImageButton) findViewById(R.id.imb_Kind_Read_19);
        t =(ImageButton) findViewById(R.id.imb_Kind_Read_20);
        u =(ImageButton) findViewById(R.id.imb_Kind_Read_21);
        v =(ImageButton) findViewById(R.id.imb_Kind_Read_22);
        w =(ImageButton) findViewById(R.id.imb_Kind_Read_23);
        x =(ImageButton) findViewById(R.id.imb_Kind_Read_24);
        y =(ImageButton) findViewById(R.id.imb_Kind_Read_25);
        z =(ImageButton) findViewById(R.id.imb_Kind_Read_26);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("a");
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("b");
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("c");
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("d");
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("e");
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("f");
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("g");
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("h");
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("i");
            }
        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("j");
            }
        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("k");
            }
        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("l");
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("m");
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("n");
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("o");
            }
        });
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("p");
            }
        });
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("q");
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("r");
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("s");
            }
        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("t");
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("u");
            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("v");
            }
        });
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("w");
            }
        });
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("x");
            }
        });
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("y");
            }
        });
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Voz("z");
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
