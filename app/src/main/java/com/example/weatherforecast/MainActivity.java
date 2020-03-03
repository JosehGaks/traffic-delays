package com.example.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView monday = (TextView) findViewById(R.id.monday);
        TextView tuesday = (TextView) findViewById(R.id.tuesday);
        TextView wednesday = (TextView) findViewById(R.id.wednesday);
        TextView thursday = (TextView) findViewById(R.id.thursday);

        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mondayIntent = new Intent(MainActivity.this,MondayActivity.class);
                startActivity(mondayIntent);
            }
        });

        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tuesdayIntent = new Intent(MainActivity.this,TuesdayActivity.class);
                startActivity(tuesdayIntent);
            }
        });

        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wednesdayIntent = new Intent(MainActivity.this,WednesdayActivity.class);
                startActivity(wednesdayIntent);
            }
        });

        thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thursdayIntent = new Intent(MainActivity.this,ThursdayActivity.class);
                startActivity(thursdayIntent);

            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
