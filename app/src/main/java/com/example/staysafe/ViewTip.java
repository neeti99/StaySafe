package com.example.staysafe;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewTip extends AppCompatActivity {
    private RecyclerView tipList;
    private ViewTipAdapter adapter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_tip);
        tipList = (RecyclerView) findViewById(R.id.view_tips_list);
        tipList.setHasFixedSize(true);
        adapter = new ViewTipAdapter(testData());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        tipList.setLayoutManager(layoutManager);
        tipList.setAdapter(adapter);
    }

    public ArrayList<String> testData(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Use Strong Passwords");
        list.add("Use a full-service internet security suite");
        list.add("Manage your social media settings");
        list.add("Strengthen your home network");
        list.add("Know what to do if you become a victim ");
        return list;
    }
}

