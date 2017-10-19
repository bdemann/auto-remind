package com.mikeporet.autoremind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Calendar;

public class YearActivity extends AppCompatActivity {

    private Spinner year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);

        ArrayList<String> years = new ArrayList<String>();
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = thisYear; i >= 1950; i--) {
            years.add(Integer.toString(i));
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, years);
        year = (Spinner)findViewById(R.id.yearspinner);
        year.setAdapter(adapter);


    }

    public void finishClick(View v) {
        String make = getIntent().getStringExtra("Make");
        String model = getIntent().getStringExtra("Model");
        Intent intent = new Intent(this, Car_Home.class);
        intent.putExtra("Make", make);
        intent.putExtra("Model", model);
        intent.putExtra("Year", year.getSelectedItem().toString());
        startActivity(intent);
    }
}
