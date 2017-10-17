package com.mikeporet.autoremind;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Car_Home extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_home);

        //Set Dummy Data
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Oil Change", R.drawable.oilchange));
        taskList.add(new Task("Air Filter", R.drawable.airfilter));
        taskList.add(new Task("Battery Replacement", R.drawable.batteryreplacement));
        taskList.add(new Task("Coolant Flush", R.drawable.coolantflush));
        recyclerView = (RecyclerView) findViewById(R.id.rv);

        CarTasksRecyclerAdapter adapter = new CarTasksRecyclerAdapter(taskList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
