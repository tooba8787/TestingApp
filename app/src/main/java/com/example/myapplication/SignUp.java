package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    TextView signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signIn = findViewById(R.id.tv_sign_up_sign_in);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                Intent i = new Intent(SignUp.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}