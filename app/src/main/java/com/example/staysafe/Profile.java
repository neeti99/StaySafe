package com.example.staysafe;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    private TextView name;
    private TextView email;
    private TextView age;
    private TextView password;
    private TextView rewards;
    private TextView phone;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        age = findViewById(R.id.age);
        password = findViewById(R.id.password);
        rewards = findViewById(R.id.rewards);
        phone = findViewById(R.id.rewards);
    }
}
