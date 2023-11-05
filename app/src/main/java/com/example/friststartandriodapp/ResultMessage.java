package com.example.friststartandriodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultMessage extends AppCompatActivity {
    private TextView txtMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_message);
        txtMessage=findViewById(R.id.txtMessage);
        Intent intent =getIntent();
        String message = intent.getStringExtra("MESSAGE");
        if (!message.equals("")){
            txtMessage.setText(message);
        }

    }
}