package com.example.refael92.mivnetochna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button signInBtn = findViewById(R.id.mainBtnSignIn);
        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signInBtnClicked();
            }
        });

        final TextView readMeTextView =findViewById(R.id.mainTvReadMe);
        readMeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent readMeIntent = new Intent(MainActivity.this,ReadmeActivity.class);
                MainActivity.this.startActivity(readMeIntent);
            }
        });

        final TextView joinTextView =findViewById(R.id.mainTvJoin);
        joinTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent joinIntent = new Intent(MainActivity.this,RegisterActivity.class);
                MainActivity.this.startActivity(joinIntent);
            }
        });
    }

    private void signInBtnClicked() {
        // TO DO: validateFields()
        Intent signInIntent = new Intent(MainActivity.this,HomeActivity.class);
        MainActivity.this.startActivity(signInIntent);
    }
}
