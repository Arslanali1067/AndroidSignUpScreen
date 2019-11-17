package com.example.travelpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView journeyText;
    Typeface myFont;
    Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        journeyText = (TextView)findViewById(R.id.journey_text);
        myFont = Typeface.createFromAsset(getAssets(),"font/GothamBoldItalic.ttf");
        journeyText.setTypeface(myFont);
        signInButton = (Button)findViewById(R.id.signIn_button);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signInActivity = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(signInActivity);
            }
        });
    }
}
