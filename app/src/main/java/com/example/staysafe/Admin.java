package com.example.staysafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Admin extends AppCompatActivity implements View.OnClickListener {

    private Button directMessage;
    private Button revTip;
    private Button revVol;
    private Button revComp;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_home);
        directMessage = (Button) findViewById(R.id.DirectMsg);
        revTip = (Button) findViewById(R.id.ReceivedTips);
        revVol = (Button) findViewById(R.id.RevVolunteers);
        revComp = (Button) findViewById(R.id.RevComplaint);
        setListener();
    }

    private void setListener() {
        directMessage.setOnClickListener(this);
        revComp.setOnClickListener(this);
        revVol.setOnClickListener(this);
        revTip.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String text = "Nothing to display";
        Intent intent;
        switch (view.getId()) {
            case R.id.DirectMsg:
                text = "Direct Message Sent";
                break;
            case R.id.ReceivedTips:
                intent = new Intent(this, ReviewTips.class);
                text = "Tips received from user and sent fro review";
                startActivity(intent);
                break;
            case R.id.RevVolunteers:
                text = "Resources and events are received from user and sent for review";
                intent = new Intent(this, ReviewTips.class);
                startActivity(intent);
                break;
            case R.id.RevComplaint:
                text = "User registered a complaint and sent for review and if approved proper ";
                intent = new Intent(this, ReviewComplaint.class);
                startActivity(intent);
                break;
        }
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
