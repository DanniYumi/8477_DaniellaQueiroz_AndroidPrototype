package com.example.a8477_daniella_queiroz_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        Button registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registeronclick(v);
            }
        });
    }

    private void registeronclick(View v) {
        Intent registerScreenIntent = new Intent(signin.this, MainActivity.class);

        startActivity(registerScreenIntent);
        finish();
    }
}