package com.example.staysafe;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReviewTips extends AppCompatActivity {

    private RecyclerView reviewTipList;
    private ReviewTipAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review_tips);
        reviewTipList = (RecyclerView)findViewById(R.id.review_tip_list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        reviewTipList.setLayoutManager(layoutManager);
        adapter = new ReviewTipAdapter(getTestData());
        reviewTipList.setHasFixedSize(true);
        reviewTipList.setAdapter(adapter);
    }

    private ArrayList<String> getTestData() {
        ArrayList<String> list = new ArrayList<>();
        String text = "review suggestion";
        for(int i = 0;i < 10;i++){
            list.add(text);
        }
        return list;
    }
}
