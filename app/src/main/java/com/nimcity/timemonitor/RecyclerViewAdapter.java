package com.nimcity.timemonitor;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    private String[] dataset;

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public RecyclerViewViewHolder(@NonNull TextView itemView) {
            super(itemView);
            this.textView = itemView;
        }
    }

    public RecyclerViewAdapter(String[] dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView textView = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_text_view, parent, false);
        RecyclerViewViewHolder holder = new RecyclerViewViewHolder(textView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        holder.textView.setText(dataset[position]);
    }

    @Override
    public int getItemCount() {
        return this.dataset.length;
    }
}
