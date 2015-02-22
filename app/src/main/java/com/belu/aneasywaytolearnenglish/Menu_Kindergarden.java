package com.belu.aneasywaytolearnenglish;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu_Kindergarden extends Activity {

    private ImageButton Color;
    private ImageButton Number;
    private ImageButton Leter;
    private ImageButton Back;
    private Intent Cambio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__kindergarden);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Color =(ImageButton) findViewById(R.id.imb_menuKind_color);
        Number =(ImageButton) findViewById(R.id.imb_menuKind_num);
        Leter =(ImageButton) findViewById(R.id.imb_menuKind_letra);
        Back =(ImageButton) findViewById(R.id.img_back);
        Cambio = new Intent(Menu_Kindergarden.this, Dialog_Read_Exer_color.class);

        Color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambio.putExtra("Menu", "Colors");
                Cambio.putExtra("Back", "Kindergarten");
                startActivity(Cambio);
                finish();
            }
        });
        Number.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v){
                Cambio.putExtra("Menu", "Numbers");
                Cambio.putExtra("Back", "Kindergarten");
                startActivity(Cambio);
                finish();
            }
        });
        Leter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cambio.putExtra("Menu", "Letters");
                Cambio.putExtra("Back", "Kindergarten");
                startActivity(Cambio);
                finish();
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu_Kindergarden.this, MenuPrincipal.class));
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        startActivity(new Intent(Menu_Kindergarden.this, MenuPrincipal.class));
    }
}
