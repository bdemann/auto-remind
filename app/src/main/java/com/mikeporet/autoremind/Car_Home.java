package com.mikeporet.autoremind;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Car_Home extends AppCompatActivity {

    RecyclerView recyclerView;
    TextView make_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_home);

        String make = getIntent().getStringExtra("Make");
        make_title = (TextView) findViewById(R.id.make_display);
        make_title.setText(make);

        //Set Dummy Data
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Oil Change", R.drawable.oilchange, 0, '0', (short)0, null, null, ""));
        taskList.add(new Task("Air Filter", R.drawable.airfilter, 0, '0', (short)0, null, null, ""));
        taskList.add(new Task("Battery Replacement", R.drawable.batteryreplacement, 0, '0', (short)0, null, null, ""));
        taskList.add(new Task("Coolant Flush", R.drawable.coolantflush, 0, '0', (short)0, null, null, ""));
        recyclerView = (RecyclerView) findViewById(R.id.rv);

        CarTasksRecyclerAdapter adapter = new CarTasksRecyclerAdapter(taskList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
