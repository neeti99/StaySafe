package com.example.staysafe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LeaderBoardAdapter extends RecyclerView.Adapter<LeaderBoardAdapter.LeaderBoardVH> {
    private ArrayList<RankList> list;

    LeaderBoardAdapter(ArrayList<RankList> rankLists){
        list = rankLists;
    }

    @NonNull
    @Override
    public LeaderBoardAdapter.LeaderBoardVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rank_list_content,parent,false);
        return new LeaderBoardVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LeaderBoardAdapter.LeaderBoardVH holder, int position) {
        holder.rank.setText(list.get(position).rank);
        holder.name.setText(list.get(position).name);
        holder.score.setText(list.get(position).score);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LeaderBoardVH extends RecyclerView.ViewHolder {
        private TextView rank;
        private TextView name;
        private TextView score;

        public LeaderBoardVH(@NonNull View itemView) {
            super(itemView);
            rank = (TextView)itemView.findViewById(R.id.rank);
            name = (TextView)itemView.findViewById(R.id.ranker);
            score = (TextView)itemView.findViewById(R.id.score);
        }
    }
}
