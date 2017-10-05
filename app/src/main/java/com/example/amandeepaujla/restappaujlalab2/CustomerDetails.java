package com.example.amandeepaujla.restappaujlalab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomerDetails extends AppCompatActivity {

    ArrayList<String> ls;
    String listOfFoods = "";
    TextView foodList;
    EditText custName;
    EditText creditCard;
    EditText postalCode;
    String cn;
    String myfood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);
        ls = getIntent().getStringArrayListExtra("list");
           for(String f : ls)
           {
               listOfFoods += f+ ", ";
           }
        foodList = (TextView)findViewById(R.id.txtViewFoods);
        foodList.setText(listOfFoods);
        custName = (EditText) findViewById(R.id.editTextName);
        creditCard = (EditText) findViewById(R.id.editTextCredit);
        postalCode = (EditText) findViewById(R.id.editTextPostalCode);
    }

    public void openCheckout(View view){

          Intent i = new Intent(this, DisplayOrder.class);
          i.putExtra("CustName", custName.getText().toString());
          i.putExtra("CustCredit", creditCard.getText().toString());
          i.putExtra("CustPostal", postalCode.getText().toString());
          i.putExtra("FoodItems", listOfFoods);
          startActivity(i);

    }

    public void BacktoMenu(View v){
        Intent intent = new Intent(this, MenuFoodItems.class);
        startActivity(intent);
    }

}
