package com.belu.aneasywaytolearnenglish;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Luis on 18/02/2015.
 */
public class Dialog_Read_Exer_color extends Activity {

    private ImageButton Read;
    private ImageButton Exer;
    private ImageButton Back;
    private Intent CamRead;
    private Intent CamExe;
    private Intent CamBack;
    String tittle;
    private TextView tv_Tittle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_menucolor);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Titulo(getIntent().getStringExtra("Menu"), getIntent().getStringExtra("Back"));

        tv_Tittle = (TextView) findViewById(R.id.Dialog_Tittle);
        Read =(ImageButton) findViewById(R.id.Dialog_imb_Read);
        Exer =(ImageButton) findViewById(R.id.Dialog_imb_Exercise);
        Back =(ImageButton) findViewById(R.id.imb_back_dialo_kind);
        tv_Tittle.setText(tittle);

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(CamBack);
                finish();
            }
        });

        Read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(CamRead);
            }
        });

        Exer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(CamExe);
            }
        });


    }

    private void Titulo(String Menu,String Back){
        switch (Menu){
            case "Colors":
                tittle = "Colors";
                CamRead = new Intent(Dialog_Read_Exer_color.this, Read_Kinder_Color.class);
                CamExe = new Intent(Dialog_Read_Exer_color.this, Exe_Kinder_Color.class);
                break;
            case "Numbers":
                tittle = "Numbers";
                CamRead = new Intent(Dialog_Read_Exer_color.this, Read_Kinder_Num.class);
                CamExe = new Intent(Dialog_Read_Exer_color.this, Exe_Kinder_Num.class);
                break;
            case "Letters":
                tittle = "Letters";
                CamRead = new Intent(Dialog_Read_Exer_color.this, Read_Kinder_Lett.class);
                break;
            case "House":
                tittle = "House";
                CamRead = new Intent(Dialog_Read_Exer_color.this, Read_Elem_House.class);
                CamRead.putExtra("Menu","house");
                CamExe = new Intent(Dialog_Read_Exer_color.this, Exe_Elem_House.class);
                CamExe.putExtra("Menu","house");
                break;
            case "Human Body":
                tittle = "Human Body";
                CamRead = new Intent(Dialog_Read_Exer_color.this, Read_Elem_House.class);
                CamRead.putExtra("Menu","HB");
                CamExe = new Intent(Dialog_Read_Exer_color.this, Exe_Elem_House.class);
                CamExe.putExtra("Menu","HB");
                break;
            case "People":
                tittle = "People";
                CamRead = new Intent(Dialog_Read_Exer_color.this, Read_Elem_House.class);
                CamRead.putExtra("Menu","people");
                CamExe = new Intent(Dialog_Read_Exer_color.this, Exe_Elem_House.class);
                CamExe.putExtra("Menu","people");
                break;
            case "Animals":
                tittle = "Animals";
                CamRead = new Intent(Dialog_Read_Exer_color.this, Read_Elem_House.class);
                CamRead.putExtra("Menu","animal");
                CamExe = new Intent(Dialog_Read_Exer_color.this, Exe_Elem_House.class);
                CamExe.putExtra("Menu","animal");
                break;
            case "City":
                tittle = "City";
                CamRead = new Intent(Dialog_Read_Exer_color.this, Read_Elem_House.class);
                CamRead.putExtra("Menu","city");
                CamExe = new Intent(Dialog_Read_Exer_color.this, Exe_Elem_House.class);
                CamExe.putExtra("Menu","city");
                break;
        }
        switch (Back){
            case "Kindergarten":
                CamBack = new Intent(Dialog_Read_Exer_color.this, Menu_Kindergarden.class);
                break;
            case "Elementary":
                CamBack = new Intent(Dialog_Read_Exer_color.this, Menu_Elementary.class);
                break;
            case "MoreExercises":
                CamBack = new Intent(Dialog_Read_Exer_color.this, Menu_More_Exercise.class);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        startActivity(CamBack);
    }
}
