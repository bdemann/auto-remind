package com.mikeporet.autoremind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MakesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    public ArrayList<String> makeList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makes);

        //Set Dummy Data
        makeList = new ArrayList<>();
        makeList.add("Chevrolet");
        makeList.add("Dodge");
        makeList.add("Honda");
        makeList.add("Jeep");
        makeList.add("Toyota");

        recyclerView = (RecyclerView) findViewById(R.id.makerv);

        CarMakesRecyclerAdapter adapter = new CarMakesRecyclerAdapter(makeList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        setTitle("Choose a Make");
    }

    public ArrayList<String> getMakeList() {
        return makeList;
    }

    public void setMakeList(ArrayList<String> makeList) {
        this.makeList = makeList;
    }
}
