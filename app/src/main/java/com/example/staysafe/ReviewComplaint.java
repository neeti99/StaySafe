package com.example.staysafe;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ReviewComplaint extends AppCompatActivity implements View.OnClickListener {

    private TextView complaint;
    private Button approve;
    private Button decline;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review_complaint);
        complaint = (TextView) findViewById(R.id.complaint);
        approve = (Button) findViewById(R.id.approve_complaint);
        decline = (Button) findViewById(R.id.decline_complaint);
        complaint.setText("User registered a complaint");
        setListeners();
    }

    private void setListeners() {
        approve.setOnClickListener(this);
        decline.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String text = "";
        switch (view.getId()) {
            case R.id.approve_complaint:
                text = "complaint is approved and details are shared with user and proper procedure will be followed";
                break;
            case R.id.decline_complaint:
                text = "not a genuine complaint";
        }
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
