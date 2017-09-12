package com.android.acadgild.preferencesettings121;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Defining a click  listener to call Settings Activity*/
        android.view.View.OnClickListener settingsClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent object to start settings activity
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
            }
        };

        Button btnSettings = (Button) findViewById(R.id.btn_settings);
        btnSettings.setOnClickListener(settingsClickListener);
    }
}
