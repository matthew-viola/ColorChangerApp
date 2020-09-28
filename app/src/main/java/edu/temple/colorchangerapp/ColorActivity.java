package edu.temple.colorchangerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {
    Spinner spinner;
    ArrayList<String> colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new ArrayList<>();
        colors.add("lightgray");
        colors.add("blue");
        colors.add("yellow");
        colors.add("magenta");
        colors.add("green");
        colors.add("cyan");
        colors.add("gray");
        colors.add("red");
        colors.add("white");
        colors.add("darkgray");
        spinner = findViewById(R.id.spinner);
     //   final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, colors);
        final BaseAdapter color = new ColorAdapter(this, colors);
        spinner.setAdapter(color);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                View v = spinner.getRootView();
                v.setBackgroundColor(Color.parseColor(spinner.getSelectedItem().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}
