package com.mikeporet.autoremind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ModelActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    public ArrayList<String> modelList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makes);

        String make = getIntent().getStringExtra("Make");
        modelList = createModelList(make);

        recyclerView = (RecyclerView) findViewById(R.id.makerv);

        CarModelsRecyclerAdapter adapter = new CarModelsRecyclerAdapter(make, modelList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        setTitle("Choose a Model");
    }

    private ArrayList<String> createModelList(String make) {
        ArrayList<String> modelList = new ArrayList<>();
        switch (make) {
            case "Chevrolet":
                modelList.add("Camero");
                modelList.add("Cruze");
                modelList.add("Spark");
                modelList.add("Corvette");
                modelList.add("Malibu");
                break;
            case "Dodge":
                modelList.add("Challenger");
                modelList.add("Durango");
                modelList.add("Charger");
                modelList.add("Viper");
                modelList.add("Dart");
                break;
            case "Honda":
                modelList.add("Civc");
                modelList.add("Accord");
                modelList.add("Insight");
                modelList.add("Ridgeline");
                modelList.add("Odyssey");
                break;
            case "Jeep":
                modelList.add("Grand Cherokee");
                modelList.add("Wrangler");
                modelList.add("Cherokee");
                modelList.add("Patriot");
                modelList.add("Compass");
                break;
            case "Toyota":
                modelList.add("Corrola");
                modelList.add("Camry");
                modelList.add("Prius");
        }

        return modelList;
    }
}
