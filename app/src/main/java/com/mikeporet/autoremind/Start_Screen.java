package com.mikeporet.autoremind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class Start_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__screen);
    }

    public void start_click(View view){
        //Toast toast = Toast.makeText(getApplicationContext(),"Don't push my buttons", Toast.LENGTH_LONG);
        //toast.show();
        Intent intent = new Intent(this, MakesActivity.class);
        startActivity(intent);
        return;
    }
}
