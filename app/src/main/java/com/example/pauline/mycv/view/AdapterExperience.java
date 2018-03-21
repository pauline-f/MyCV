package com.example.pauline.mycv.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pauline.mycv.R;
import com.example.pauline.mycv.model.Experience;

/**
 * Created by pauline on 19/03/2018.
 */

public class AdapterExperience extends RecyclerView.Adapter<AdapterExperience.ViewHolder> {
    private Experience[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView textViewTitle;
        public TextView textViewDate;
        public TextView textViewMissions;
        public ViewHolder(View v) {
            super(v);
            textViewTitle = v.findViewById(R.id.item_title);
            textViewDate = v.findViewById(R.id.item_date);
            textViewMissions = v.findViewById(R.id.item_missions);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AdapterExperience(Experience[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AdapterExperience.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.experience_item, parent, false);
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textViewTitle.setText(mDataset[position].getTitle());
        holder.textViewDate.setText(mDataset[position].getDate());

        StringBuilder missions = new StringBuilder();
        for (int i = 0; i < mDataset[position].getMission().length; i++) {
            missions.append("* ");
            missions.append(mDataset[position].getMission()[i]);
            missions.append(System.getProperty("line.separator"));
        }
        holder.textViewMissions.setText(missions);


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}