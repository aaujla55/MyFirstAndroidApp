package com.example.amandeepaujla.restappaujlalab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static android.R.attr.checked;
import static android.R.attr.visible;

public class MenuFoodItems extends AppCompatActivity {

    String selectedCuisine;
    CheckBox foodItem1;
    CheckBox foodItem2;
    CheckBox foodItem3;
    CheckBox foodItem4;
    ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_food_items);
        Bundle gt = getIntent().getExtras();
        selectedCuisine = gt.getString("selectedCuisine");


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();

        switch (selectedCuisine) {
            case "American":
                menuInflater.inflate(R.menu.menu, menu);
                break;
            case "Italian":
                menuInflater.inflate(R.menu.menu2, menu);
                break;
            case "Chinese":
                menuInflater.inflate(R.menu.menu3, menu);
                break;
        }
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        PopulateFoodItems(item.getItemId());
        return true;
    }

    private void PopulateFoodItems(int foodItem)
    {
        foodItem1 = (CheckBox)findViewById(R.id.chckBoxFood1);
        foodItem2 = (CheckBox)findViewById(R.id.chckBoxFood2);
        foodItem3 = (CheckBox)findViewById(R.id.chckBoxFood3);
        foodItem4 = (CheckBox)findViewById(R.id.chckBoxFood4);
        foodItem1.setVisibility(View.VISIBLE);
        foodItem2.setVisibility(View.VISIBLE);
        foodItem3.setVisibility(View.VISIBLE);
        foodItem4.setVisibility(View.VISIBLE);
        Button b = (Button)findViewById(R.id.btnNextCustomerDetails);
        b.setVisibility(View.VISIBLE);

        switch(foodItem)
        {
            case R.id.rest1: {
                foodItem1.setText(R.string.kegsteakhouse_food_1);
                foodItem2.setText(R.string.kegsteakhouse_food_2);
                foodItem3.setText(R.string.kegsteakhouse_food_3);
                foodItem4.setText(R.string.kegsteakhouse_food_4);

                break;
            }
            case R.id.rest2: {
                foodItem1.setText(R.string.amsterdam_food_1);
                foodItem2.setText(R.string.amsterdam_food_2);
                foodItem3.setText(R.string.amsterdam_food_3);
                foodItem4.setText(R.string.amsterdam_food_4);
                break;
            }

            case R.id.rest3: {
                foodItem1.setText(R.string.overeasy_food_1);
                foodItem2.setText(R.string.overeasy_food_2);
                foodItem3.setText(R.string.overeasy_food_3);
                foodItem4.setText(R.string.overeasy_food_4);
                break;
            }
            case R.id.rest4:{
                foodItem1.setText(R.string.italianBistro_food_1);
                foodItem2.setText(R.string.italianBistro_food_2);
                foodItem3.setText(R.string.italianBistro_food_3);
                foodItem4.setText(R.string.italianBistro_food_4);

                break;
            }
            case R.id.rest5:{
                foodItem1.setText(R.string.fabbrica_food_1);
                foodItem2.setText(R.string.fabbrica_food_2);
                foodItem3.setText(R.string.fabbrica_food_3);
                foodItem4.setText(R.string.fabbrica_food_4);

                break;
            }
            case R.id.rest6:{
                foodItem1.setText(R.string.ascari_food_1);
                foodItem2.setText(R.string.ascari_food_2);
                foodItem3.setText(R.string.ascari_food_3);
                foodItem4.setText(R.string.ascari_food_4);

                break;
            }
            case R.id.rest7:{
                foodItem1.setText(R.string.dingho_food_1);
                foodItem2.setText(R.string.dingho_food_2);
                foodItem3.setText(R.string.dingho_food_3);
                foodItem4.setText(R.string.dingho_food_4);

                break;
            }
            case R.id.rest8:{
                foodItem1.setText(R.string.timchoi_food_1);
                foodItem2.setText(R.string.timchoi_food_2);
                foodItem3.setText(R.string.timchoi_food_3);
                foodItem4.setText(R.string.timchoi_food_4);

                break;
            }
            case R.id.rest9:{
                foodItem1.setText(R.string.luckychinese_food_1);
                foodItem2.setText(R.string.luckychinese_food_2);
                foodItem3.setText(R.string.luckychinese_food_3);
                foodItem4.setText(R.string.luckychinese_food_4);

                break;
            }
            default:break;

        }
    }

    public void PleaseOpen(View view) {

        ArrayList<String> array = new ArrayList<String>();

        if(foodItem1.isChecked()) {
            array.add(foodItem1.getText().toString());
        }
        if(foodItem2.isChecked())
        {
            array.add(foodItem2.getText().toString());
        }
        if(foodItem3.isChecked())
        {
            array.add(foodItem3.getText().toString());
        }
        if(foodItem4.isChecked())
        {
            array.add(foodItem4.getText().toString());
        }

        Intent i = new Intent(this, CustomerDetails.class);
        i.putStringArrayListExtra("list",array);
        startActivity(i);
    }
    public void backtoC(View view) {
        Intent intent = new Intent(this, Cuisines.class);
        startActivity(intent);
    }


}

