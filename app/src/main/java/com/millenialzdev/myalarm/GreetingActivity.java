package com.millenialzdev.myalarm;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class GreetingActivity extends AppCompatActivity {

    private int[] greetingImages = {
            R.drawable.greetings1, // Replace with your actual drawable resource names
            R.drawable.greeting2,
            R.drawable.greeting3
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        ImageView imageView = findViewById(R.id.greetingImageView);

        // Display a random image
        Random random = new Random();
        int randomIndex = random.nextInt(greetingImages.length);
        imageView.setImageResource(greetingImages[randomIndex]);
    }
}