package com.example.amandeepaujla.restappaujlalab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayOrder extends AppCompatActivity {
    TextView name;
    TextView orderDetails;
    TextView creditnumber;
    TextView postalCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_order);


        name = (TextView)findViewById(R.id.txtViewCusName);
        orderDetails = (TextView)findViewById(R.id.txtViewOrderFood);
        creditnumber  = (TextView)findViewById(R.id.txtcreditNumber);
        postalCode = (TextView)findViewById(R.id.txtpostal);

        Intent intent = getIntent();
        String custName = getIntent().getStringExtra("CustName");
        String custOrder = getIntent().getStringExtra("FoodItems");
        String custCredit = getIntent().getStringExtra("CustCredit");
        String custPostal = getIntent().getStringExtra("CustPostal");

        name.setText(custName);
        orderDetails.setText(custOrder);
        creditnumber.setText(custCredit);
        postalCode.setText(custPostal);


    }
}
