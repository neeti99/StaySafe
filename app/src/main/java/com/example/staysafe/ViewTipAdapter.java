package com.example.staysafe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewTipAdapter extends RecyclerView.Adapter<ViewTipAdapter.ViewTipHolder> {

    private ArrayList<String> tip_list;

    public ViewTipAdapter(ArrayList<String> list) {
        tip_list = list;
    }


    @Override
    public ViewTipAdapter.ViewTipHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tips_text, parent, false);
        return new ViewTipHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewTipAdapter.ViewTipHolder holder, int position) {
        holder.tip_text.setText(tip_list.get(position));
    }

    @Override
    public int getItemCount() {
        return tip_list.size();
    }

    public static class ViewTipHolder extends RecyclerView.ViewHolder {
        public TextView tip_text;

        public ViewTipHolder(@NonNull View itemView) {
            super(itemView);
            tip_text = (TextView) itemView.findViewById(R.id.tips_text);
        }

    }
}
