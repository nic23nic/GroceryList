package com.uottawa.nicoloreto.grocerylist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonViewMeals;
    private Button buttonViewList;
    private Button buttonIngredients;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();


    }

    private void init(){

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        buttonIngredients = findViewById(R.id.buttonIngredients);
        buttonViewList = findViewById(R.id.buttonViewList);
        buttonViewMeals = findViewById(R.id.buttonViewMeals);

        buttonViewMeals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMealViewer();
            }
        });
        buttonViewList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toListViewer();
            }
        });
        buttonIngredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toIngredientsViewer();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void toMealViewer(){
        Intent intent = new Intent(this,MealViewer.class);
        startActivity(intent);
    }
    public void toListViewer(){
        Intent intent = new Intent(this,ListViewer.class);
        startActivity(intent);
    }
    public void toIngredientsViewer(){
        Intent intent = new Intent(this,IngredientsViewer.class);
        startActivity(intent);
    }
}
