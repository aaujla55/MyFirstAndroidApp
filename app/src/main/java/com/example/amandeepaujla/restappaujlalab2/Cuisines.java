package com.example.amandeepaujla.restappaujlalab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Cuisines extends AppCompatActivity {

    private RadioGroup rg;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisines);

        rg = (RadioGroup) findViewById(R.id.radio_Cuisine_group);
        btn = (Button) findViewById(R.id.btnNextToMenu);

    }
        public void openMenuFoodItems(View view){
            final String value =
                    ((RadioButton)findViewById(rg.getCheckedRadioButtonId()))
                            .getText().toString();
            Intent intent = new Intent(this, MenuFoodItems.class);
            intent.putExtra("selectedCuisine",value);
            startActivity(intent);
        }

    }

