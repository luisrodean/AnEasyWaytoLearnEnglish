package com.belu.aneasywaytolearnenglish;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu_More_Exercise extends Activity {

    private ImageButton City;
    private ImageButton House;
    private ImageButton H_B;
    private ImageButton Animals;
    private ImageButton People;
    private ImageButton Back;
    private Intent Cambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elementary_menu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        City =(ImageButton) findViewById(R.id.imb_menu_more_e1);
        House =(ImageButton) findViewById(R.id.imb_menu_more_e2);
        H_B =(ImageButton) findViewById(R.id.imb_menu_more_e3);
        Animals =(ImageButton) findViewById(R.id.imb_menu_more_e4);
        People =(ImageButton) findViewById(R.id.imb_menu_more_e5);
        Back =(ImageButton) findViewById(R.id.imb_elem_back);

        Cambio = new Intent(Menu_More_Exercise.this, Dialog_Read_Exer_color.class);

        City.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambio.putExtra("Menu", "City");
                Cambio.putExtra("Back", "More_Exer");
                startActivity(Cambio);
                finish();
            }
        });
        House.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v){
                Cambio.putExtra("Menu", "House");
                Cambio.putExtra("Back", "More_Exer");
                startActivity(Cambio);
                finish();
            }
        });
        H_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambio.putExtra("Menu", "H_B");
                Cambio.putExtra("Back", "More_Exer");
                startActivity(Cambio);
                finish();
            }
        });
        Animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambio.putExtra("Menu", "Animals");
                Cambio.putExtra("Back", "More_Exer");
                startActivity(Cambio);
                finish();
            }
        });
        People.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambio.putExtra("Menu", "People");
                Cambio.putExtra("Back", "More_Exer");
                startActivity(Cambio);
                finish();
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu_More_Exercise.this, MenuPrincipal.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        startActivity(new Intent(Menu_More_Exercise.this, MenuPrincipal.class));
    }
}
