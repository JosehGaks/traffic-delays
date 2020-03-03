package com.example.weatherforecast;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter<Weather> {
    private static final String LOG_TAG = WeatherAdapter.class.getSimpleName();


    public WeatherAdapter(@NonNull Activity context, ArrayList<Weather> temperature) {
        super(context, 0, temperature);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }
        // Get the {@link Word} object located at this position in the list
        Weather currentWeather = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView temperatureTextView = (TextView) listItemView.findViewById(R.id.highesttemp_text_view);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        temperatureTextView.setText(currentWeather.getmAverageTemperature());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView tempTextView = (TextView) listItemView.findViewById(R.id.lowesttemp_text_view);
        // Get the version number from the current Word object and
        // set this text on the number TextView
        tempTextView.setText(currentWeather.getmDefaultTemperature());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current Word object and
        // set the image to iconView
        imageView.setImageResource(currentWeather.getmImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
