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
    private List<Task> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_home);

        String make = getIntent().getStringExtra("Make");
        String model = getIntent().getStringExtra("Model");
        int year = Integer.parseInt(getIntent().getStringExtra("Year"));
        make_title = (TextView) findViewById(R.id.make_display);
        String name = (year == 0 ? "": year + " ") + make + " " + model;
//        make_title.setText(name);
        setTitle(name);

        //Set Dummy Data
        taskList = new ArrayList<>();
        taskList.add(new Task("Oil Change", R.drawable.oilchange, 0, '0', (short)0, null, null, ""));
        taskList.add(new Task("Air Filter", R.drawable.airfilter, 0, '0', (short)0, null, null, ""));
        taskList.add(new Task("Battery Replacement", R.drawable.batteryreplacement, 0, '0', (short)0, null, null, ""));
        taskList.add(new Task("Coolant Flush", R.drawable.coolantflush, 0, '0', (short)0, null, null, ""));
        recyclerView = (RecyclerView) findViewById(R.id.rv);

        CarTasksRecyclerAdapter adapter = new CarTasksRecyclerAdapter(taskList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public List<Task> getTaskList() {

        return taskList;
    }
}
