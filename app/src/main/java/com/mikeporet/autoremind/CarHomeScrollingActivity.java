package com.mikeporet.autoremind;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class CarHomeScrollingActivity extends AppCompatActivity {

    private Car car;
    private RecyclerView recyclerView;
    private List<Task> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_home_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_car);
        setSupportActionBar(toolbar);

        Car car = getIntent().getParcelableExtra("Car");

        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar_car);
        appBarLayout.setBackground(getDrawable(car.getImage()));
        String name = car.toString();
        setTitle(name);

        taskList = getTasks(car);
        recyclerView = (RecyclerView) findViewById(R.id.rv);

        CarTasksRecyclerAdapter adapter = new CarTasksRecyclerAdapter(taskList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_car);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    private List<Task> getTasks(Car car) {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Oil Change", R.drawable.oilchange, 0, '0', (short)0, null, null, ""));
        taskList.add(new Task("Air Filter", R.drawable.airfilter, 0, '0', (short)0, null, null, ""));
        taskList.add(new Task("Battery Replacement", R.drawable.batteryreplacement, 0, '0', (short)0, null, null, ""));
        taskList.add(new Task("Coolant Flush", R.drawable.coolantflush, 0, '0', (short)0, null, null, ""));
        return taskList;
    }
}