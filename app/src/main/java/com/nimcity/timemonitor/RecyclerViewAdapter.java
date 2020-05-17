package com.nimcity.timemonitor;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    private Item[] dataset;

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder {

        public TextView itemNameTextView;
        public TextView itemTimeTextView;

        public RecyclerViewViewHolder(@NonNull ConstraintLayout layout) {
            super(layout);

            this.itemNameTextView = (TextView) layout.getChildAt(0);
            this.itemTimeTextView = (TextView) layout.getChildAt(1);
        }
    }

    public RecyclerViewAdapter(Item[] dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ConstraintLayout layout = (ConstraintLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.present_day_item_view, parent, false);
        RecyclerViewViewHolder holder = new RecyclerViewViewHolder(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        Item item = dataset[position];
        holder.itemNameTextView.setText(item.getName());
        holder.itemTimeTextView.setText(String.valueOf(item.getMinutes()));
    }

    @Override
    public int getItemCount() {
        return this.dataset.length;
    }
}
