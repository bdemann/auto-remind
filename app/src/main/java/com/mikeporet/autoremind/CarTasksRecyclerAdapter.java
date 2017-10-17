package com.mikeporet.autoremind;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikeporet on 10/11/17.
 */

public class CarTasksRecyclerAdapter extends RecyclerView.Adapter<CarTasksRecyclerAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        public TextView taskTitle;
        public ImageView taskImage;
        public TextView taskInstructions;
        public TextView taskDone;


        public ViewHolder(final View itemView) {
            super(itemView);
            taskTitle = (TextView) itemView.findViewById(R.id.task_title);
            taskImage = (ImageView) itemView.findViewById(R.id.task_image);
            taskInstructions = (TextView) itemView.findViewById(R.id.task_instructions);
            taskDone = (TextView) itemView.findViewById(R.id.task_done);
            taskInstructions.setOnClickListener(this);
          }

        @Override
        public void onClick(View v) {
            Log.d("testmebabyonemoretime", "poop scooping buggy");

            List<Task> taskList = new ArrayList<>();
            taskList.add(new Task("Oil Change", R.drawable.oilchange));
            taskList.add(new Task("Air Filter", R.drawable.airfilter));
            taskList.add(new Task("Battery Replacement", R.drawable.batteryreplacement));
            taskList.add(new Task("Coolant Flush", R.drawable.coolantflush));

            Task current_task = taskList.get(this.getAdapterPosition());
            String cTaskTitle = current_task.getTitle();
            Intent intent = new Intent(v.getContext(), TaskInstructionsActivity.class);
            intent.putExtra("Task", current_task);
            itemView.getContext().startActivity(intent);
        }
    }

    private List<Task> tasks;

    public CarTasksRecyclerAdapter(List<Task> tasks) {
        this.tasks = tasks;
    }

    public CarTasksRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.car_task_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;

    }

//    @Override
//    public ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
//
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_task_view, parent, false);
//
//        Object poop = new Object();
//
//        return new ViewHolder(v);
//    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Task task = tasks.get(position);

        TextView title = holder.taskTitle;
        title.setText(task.getTitle());

        TextView instructions = holder.taskInstructions;
        instructions.setText("INSTRUCTIONS");

        TextView done = holder.taskDone;
        done.setText("DONE");

        ImageView image = holder.taskImage;
        //instruction_image.setImageDrawable(getDrawable(current_task.getImage()));
        Log.d("imageTest", task.getImage()+"");

        //Log.d("imagedrawable", image.getDrawable().toString());
//        image.setImageDrawable(image.getContext().getDrawable(task.getImage()));
        //image.setBackgroundResource(task.getImage());
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
}
