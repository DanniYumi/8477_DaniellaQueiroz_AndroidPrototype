package com.example.a8477_daniella_queiroz_prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class AddRecipe extends AppCompatActivity {

    private EditText recipeNameEditText;
    private EditText ingredientsEditText;
    private EditText deleteEditText;
    private EditText durationEditText;
    private Button deleteButton;
    private Button addButton;
    private Button clearButton;
    private Button updateButton;
    private Button viewAllButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);

        recipeNameEditText = findViewById(R.id.RecipeEditTextText);
        ingredientsEditText=findViewById(R.id.IngredientsEditTextText);
        EditText deleteEditText= findViewById(R.id.DeleteeditTextText);
        durationEditText = findViewById(R.id.DurationEditTextNumber);
        Button deleteButton = findViewById(R.id.deleteButton);
        Button addButton = findViewById(R.id.addButton);
        Button clearButton =  findViewById(R.id.ClearButton);
        Button updateButton = findViewById(R.id.updateButton);
        Button viewAllButton = findViewById(R.id.viewAllButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add(v);
            }
        });

    }

    private void add(View v) {
        String recipeName= recipeNameEditText.getText().toString();
        String ingredients= ingredientsEditText.getText().toString();


        if(recipeName.trim().isEmpty()){
            Snackbar.make(v,"Please insert the name of the recipe", Snackbar.LENGTH_SHORT).show();
            return;
        }
    }

}