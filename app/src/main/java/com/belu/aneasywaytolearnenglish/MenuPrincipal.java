package com.belu.aneasywaytolearnenglish;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;


public class MenuPrincipal extends Activity {

    private ImageButton Kinder;
    private ImageButton Element;
    private ImageButton Exer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Kinder =(ImageButton) findViewById(R.id.imb_menuPrin_kinder);
        Element =(ImageButton) findViewById(R.id.imb_menuPrin_Elemet);
        Exer =(ImageButton) findViewById(R.id.imb_menuPrin_exer);

        Kinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(MenuPrincipal.this, Menu_Kindergarden.class));
               finish();
            }
        });
        Element.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipal.this, Menu_Elementary.class));
                finish();
            }
        });
        Exer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipal.this, Menu_More_Exercise.class));
                finish();
            }
        });

    }

}
