package com.example.friststartandriodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Message extends AppCompatActivity {
    private EditText editTextMessage;
    private Button btnSendMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        editTextMessage=findViewById(R.id.editTextMessage);
        btnSendMessage=findViewById(R.id.btnSendMessage);
        String message = editTextMessage.getText().toString().trim();
        if (message.equals("")){
            Toast.makeText(Message.this,"Please enter message",Toast.LENGTH_LONG).show();
            return;
        }
        Intent intent = new Intent(Message.this,ResultMessage.class);
        intent.putExtra("MESSAGE",message);
        startActivity(intent);

    }
}