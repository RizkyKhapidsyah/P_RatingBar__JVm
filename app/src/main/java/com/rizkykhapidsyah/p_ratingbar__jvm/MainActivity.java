package com.rizkykhapidsyah.p_ratingbar__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar RatingDemo_IDJAVA;
    Button RatingSubmitButton_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingDemo_IDJAVA = findViewById(R.id.RatingDemo_IDXML);
        RatingSubmitButton_IDJAVA = findViewById(R.id.RatingSubmitButton_IDXML);

        RatingSubmitButton_IDJAVA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float rValue = RatingDemo_IDJAVA.getRating();
                Toast.makeText(getApplicationContext(),
                        "Ratingnya adalah: " + rValue, Toast.LENGTH_LONG).show();
            }
        });
    }
}
