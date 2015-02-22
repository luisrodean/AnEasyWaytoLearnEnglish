package com.belu.aneasywaytolearnenglish;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu_Elementary extends Activity {

    private ImageButton Color;
    private ImageButton Number;
    private ImageButton Leter;
    private ImageButton Back;
    private ImageButton House;
    private ImageButton H_B;
    private ImageButton People;
    private ImageButton Animals;
    private ImageButton City;
    private Intent Cambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elementary_menu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Color =(ImageButton) findViewById(R.id.imb_elem_menu1);
        Number =(ImageButton) findViewById(R.id.imb_elem_menu2);
        Leter =(ImageButton) findViewById(R.id.imb_elem_menu3);
        Back =(ImageButton) findViewById(R.id.imb_elem_back);
        House =(ImageButton) findViewById(R.id.imb_elem_menu4);
        H_B =(ImageButton) findViewById(R.id.imb_elem_menu5);
        People =(ImageButton) findViewById(R.id.imb_elem_menu6);
        Animals =(ImageButton) findViewById(R.id.imb_elem_menu7);
        City =(ImageButton) findViewById(R.id.imb_elem_menu8);
        Cambio = new Intent(Menu_Elementary.this, Dialog_Read_Exer_color.class);

        Color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambio.putExtra("Menu", "Colors");
                Cambio.putExtra("Back", "Elementary");
                startActivity(Cambio);
                finish();
            }
        });
        Number.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v){
                Cambio.putExtra("Menu", "Numbers");
                Cambio.putExtra("Back", "Elementary");
                startActivity(Cambio);
                finish();
            }
        });
        Leter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambio.putExtra("Menu", "Letters");
                Cambio.putExtra("Back", "Elementary");
                startActivity(Cambio);
                finish();
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu_Elementary.this, MenuPrincipal.class));
                finish();
            }
        });
        House.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambio.putExtra("Menu", "House");
                Cambio.putExtra("Back", "Elementary");
                startActivity(Cambio);
                finish();
            }
        });
        H_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Cambio.putExtra("Menu", "Human Body");
                Cambio.putExtra("Back", "Elementary");
                startActivity(Cambio);
                finish();
            }
        });
        People.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambio.putExtra("Menu", "People");
                Cambio.putExtra("Back", "Elementary");
                startActivity(Cambio);
                finish();
            }
        });
        Animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambio.putExtra("Menu", "Animals");
                Cambio.putExtra("Back", "Elementary");
                startActivity(Cambio);
                finish();
            }
        });
        City.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambio.putExtra("Menu", "City");
                Cambio.putExtra("Back", "Elementary");
                startActivity(Cambio);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        startActivity(new Intent(Menu_Elementary.this, MenuPrincipal.class));
    }
}
