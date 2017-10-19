package com.mikeporet.autoremind;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ben on 10/18/2017.
 */

class CarModelsRecyclerAdapter extends RecyclerView.Adapter<CarModelsRecyclerAdapter.ViewHolder> {
    private ArrayList<String> modelList;
    private String make;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        public TextView modelName;


        public ViewHolder(final View itemView) {
            super(itemView);
            modelName = (TextView) itemView.findViewById(R.id.car_list_item);
            modelName.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(v.getContext(), YearActivity.class);
            intent.putExtra("Make", make);
            intent.putExtra("Model", modelList.get(getAdapterPosition()));
            intent.putExtra("Year", 2006);
            itemView.getContext().startActivity(intent);
        }
    }

    public CarModelsRecyclerAdapter(String make, ArrayList<String> makeList) {
        this.make = make;
        this.modelList = makeList;
    }


    @Override
    public CarModelsRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.car_menu_item, parent, false);
        CarModelsRecyclerAdapter.ViewHolder viewHolder = new CarModelsRecyclerAdapter.ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CarModelsRecyclerAdapter.ViewHolder holder, int position) {
        TextView name = holder.modelName;
        name.setText(modelList.get(position));

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

}
