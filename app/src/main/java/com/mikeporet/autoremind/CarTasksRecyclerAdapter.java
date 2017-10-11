package com.mikeporet.autoremind;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mikeporet on 10/11/17.
 */

public class CarTasksRecyclerAdapter extends RecyclerView.Adapter<CarTasksRecyclerAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {


        public TextView taskTitle;
        public ImageView taskImage;


        public ViewHolder(final View itemView) {
              super(itemView);
              taskTitle = (TextView) itemView.findViewById(R.id.task_title);
            taskImage = (ImageView) itemView.findViewById(R.id.task_image);
          }
    }

    private List<Task> tasks;

    public CarTasksRecyclerAdapter(List<Task> tasks) {
        this.tasks = tasks;
    }

    public CarTasksRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();

    }

}
