package com.example.refael92.mivnetochna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final TextView editSettingsTextView = findViewById(R.id.homeTvEditSettings);
        editSettingsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editIntent = new Intent(HomeActivity.this,ProfileActivity.class);
                HomeActivity.this.startActivity(editIntent);
            }
        });

        final Button viewMapButton = findViewById(R.id.homeBtnMap);
        viewMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(HomeActivity.this,MapsActivity.class);
                HomeActivity.this.startActivity(mapIntent);
            }
        });

        final TextView readMeTextView = findViewById(R.id.homeTvReadme);
        readMeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent readmeIntent = new Intent(HomeActivity.this,ReadmeActivity.class);
                HomeActivity.this.startActivity(readmeIntent);
            }
        });
    }
}
