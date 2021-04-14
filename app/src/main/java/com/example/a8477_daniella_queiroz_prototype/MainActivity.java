package com.example.a8477_daniella_queiroz_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signinButton = findViewById(R.id.signinButton);

        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onGetNameClick(v);
            }
        });

        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginClick(v);
            }
        });
    }

    private void onLoginClick(View v) {
        Intent homePageScreenIntent = new Intent(MainActivity.this, AddRecipe.class);

        startActivity(homePageScreenIntent);
    }

    private void onGetNameClick(View v) {
        Intent signinScreenIntent =new Intent(MainActivity.this, signin.class );

        startActivity(signinScreenIntent);
    }
}