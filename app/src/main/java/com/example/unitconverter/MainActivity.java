package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring Widgets
    EditText editText;
    TextView textView,textView2,textView3,pounds;
    Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiating Widgets

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        pounds = findViewById(R.id.pounds);

        editText = findViewById(R.id.editText);

        button2 = findViewById(R.id.button2);

        //Adding a click event for button
        button2.setOnClickListener(view -> {
            //Calling a method which converts Kilogram to Pound

            KiloToPound();

        });

    }

    @SuppressLint("SetTextI18n")
    private void KiloToPound() {

        String valueInKilo = editText.getText().toString();
        double kilo = Double.parseDouble(valueInKilo);
        double pound = kilo * 2.205;

        pounds.setText(""+pound);

    }
}