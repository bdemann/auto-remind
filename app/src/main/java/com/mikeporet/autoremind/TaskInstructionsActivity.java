package com.mikeporet.autoremind;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import org.w3c.dom.Text;

import android.net.Uri;
import java.net.URISyntaxException;

public class TaskInstructionsActivity extends AppCompatActivity {

    private TextView taskBodyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_instructions);
        Task current_task =(Task) getIntent().getSerializableExtra("Task");
        setTitle(current_task.getTitle());

        taskBodyText = (TextView) findViewById(R.id.task_instructions_body);
        ImageView instruction_image = (ImageView) findViewById(R.id.instructionpic);
        instruction_image.setImageDrawable(getDrawable(current_task.getImage()));

        switch (current_task.getTitle()) {
            case "Oil Change":
                taskBodyText.setText(R.string.oil_instuctions);
                //instruction_image.setImageDrawable(getDrawable(R.drawable.oilchange));
                break;
            case "Air Filter":
                taskBodyText.setText(R.string.air_filter_instructions);
                break;
            case "Battery Replacement":
                taskBodyText.setText(R.string.battery_replacement_instuctions);
                break;
            case "Coolant Flush":
                taskBodyText.setText(R.string.coolant_flush_instuctions);
                break;
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Done!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
}
