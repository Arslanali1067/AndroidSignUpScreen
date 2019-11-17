package com.example.travelpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView travelProText;
    Typeface myFont;
    Button signUp;
    Button signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        travelProText = (TextView)findViewById(R.id.travel_pro_text);
        myFont = Typeface.createFromAsset(this.getAssets(),"font/GothamBoldItalic.ttf");
        travelProText.setTypeface(myFont);
        signUp = (Button)findViewById(R.id.signIn_button);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUpActivity = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(signUpActivity);
            }
        });
        signIn = (Button)findViewById(R.id.signup_button);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUpActivity = new Intent(getApplicationContext(),HomeScreen.class);
                startActivity(signUpActivity);
            }
        });
    }
}
