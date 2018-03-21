package com.example.pauline.mycv.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pauline.mycv.R;
import com.example.pauline.mycv.model.Education;

/**
 * Created by pauline on 19/03/2018.
 */

public class AdapterEducation extends RecyclerView.Adapter<AdapterEducation.ViewHolder> {
    private Education[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView textViewTitle;
        public TextView textViewDate;
        public TextView textViewCity;
        public TextView textViewName;
        public ViewHolder(View v) {
            super(v);
            textViewTitle = v.findViewById(R.id.item_title);
            textViewDate = v.findViewById(R.id.item_date);
            textViewCity = v.findViewById(R.id.item_city);
            textViewName = v.findViewById(R.id.item_name);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AdapterEducation(Education[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AdapterEducation.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                           int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.education_item, parent, false);
        return new ViewHolder(v);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textViewTitle.setText(mDataset[position].getTitle());
        holder.textViewDate.setText(mDataset[position].getDate());
        holder.textViewCity.setText(mDataset[position].getCity());
        holder.textViewName.setText(mDataset[position].getName());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}