package com.example.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MondayActivity extends AppCompatActivity {
   char degrees = '\u00B0';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_list);
        ArrayList<Weather> temperature = new ArrayList<Weather>();

        temperature.add(new Weather(R.drawable.clouds,"14"+degrees,"15"+degrees));
        temperature.add(new Weather(R.drawable.rain_cloud,"12"+degrees,"11"+degrees));
        temperature.add(new Weather(R.drawable.partly_cloudy_day,"14"+degrees,"15"+degrees));
        temperature.add(new Weather(R.drawable.clouds,"14"+degrees,"15"+degrees));
        temperature.add(new Weather(R.drawable.clouds,"14"+degrees,"15"+degrees));
        temperature.add(new Weather(R.drawable.clouds,"14"+degrees,"15"+degrees));

        WeatherAdapter adapter = new WeatherAdapter(this,temperature);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
