package com.example.jagdish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText emailId;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logintodo(View view) {
        emailId = findViewById(R.id.emailId);
        if(emailId.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(),"enter email address",Toast.LENGTH_SHORT).show();
        }else {
            if (emailId.getText().toString().trim().matches(emailPattern)) {
                Toast.makeText(getApplicationContext(), "valid email address", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, todo.class );
                startActivity(i);
            } else {
                Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();
            }
        }
    }
}