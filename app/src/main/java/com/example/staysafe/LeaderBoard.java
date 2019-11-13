package com.example.staysafe;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LeaderBoard extends AppCompatActivity {

    private TextView score;
    private RecyclerView rankList;
    private LeaderBoardAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leaderboard);
        score = (TextView) findViewById(R.id.reward_points);
        score.setText("200");
        rankList = (RecyclerView) findViewById(R.id.rank_list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rankList.setLayoutManager(layoutManager);
        adapter = new LeaderBoardAdapter(getTestData());
        rankList.setAdapter(adapter);
    }

    ArrayList<RankList> getTestData() {
        ArrayList<RankList> rankLists = new ArrayList<>();
        String name = "Shiwangi";
        for (int i = 1; i <= 10; i++) {
            RankList list = new RankList();
            list.rank = String.valueOf(i);
            list.name = name;
            list.score = String.valueOf((11-i)*100);
            rankLists.add(list);
        }
        return rankLists;
    }
}
