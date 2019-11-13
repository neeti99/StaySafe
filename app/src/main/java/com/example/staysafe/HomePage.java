package com.example.staysafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity implements View.OnClickListener {

    private Button viewTips;
    private Button leaderboard;
    private Button suggestTips;
    private Button profile;
    private Button lodgeComplaint;
    private Button admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        viewTips = (Button) findViewById(R.id.viewTips);
        leaderboard = (Button) findViewById(R.id.Leaderboard);
        suggestTips = (Button) findViewById(R.id.SuggestTip);
        profile = (Button) findViewById(R.id.Profile);
        lodgeComplaint = (Button) findViewById(R.id.FileComplaint);
        admin = (Button) findViewById(R.id.Admin);

        setListeners();

    }

    private void setListeners() {
        viewTips.setOnClickListener(this);
        leaderboard.setOnClickListener(this);
        suggestTips.setOnClickListener(this);
        profile.setOnClickListener(this);
        lodgeComplaint.setOnClickListener(this);
        admin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.viewTips:
                intent = new Intent(this, ViewTip.class);
                startActivity(intent);
                break;
            case R.id.Profile:
                intent = new Intent(this, Profile.class);
                startActivity(intent);
                break;
            case R.id.Admin:
                intent = new Intent(this, Admin.class);
                startActivity(intent);
                break;
            case R.id.SuggestTip:
                intent = new Intent(this, SuggestTips.class);
                startActivity(intent);
                break;
            case R.id.Leaderboard:
                intent = new Intent(this,LeaderBoard.class);
                startActivity(intent);
                break;
        }
    }
}
