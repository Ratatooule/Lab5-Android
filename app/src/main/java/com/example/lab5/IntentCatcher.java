package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class IntentCatcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_catcher);

        ImageView imgView = findViewById(R.id.image_link);
        Intent intent = getIntent();
        if (intent != null) {
            imgView.setImageURI(intent.getParcelableExtra(Intent.EXTRA_STREAM));
        }
    }
}