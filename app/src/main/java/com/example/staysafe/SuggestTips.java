package com.example.staysafe;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SuggestTips extends AppCompatActivity implements View.OnClickListener{

    private EditText suggestTip;
    private Button sendSuggest;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suggest_tips);
        suggestTip = (EditText)findViewById(R.id.suggestTip);
        sendSuggest = (Button)findViewById(R.id.sendTip);
        suggestTip.setText("");
        setListeners();
    }

    private void setListeners(){
        suggestTip.setOnClickListener(this);
        sendSuggest.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String text = "";
        switch (view.getId()){
            case R.id.suggestTip:
                text = "Enter the suggestion you want to send";
                break;
            case R.id.sendTip:
                text = "Message : " + suggestTip.getText() + " : has been sent to admin for review.";
                break;
        }
        Toast.makeText(this,text,Toast.LENGTH_LONG).show();
    }
}
