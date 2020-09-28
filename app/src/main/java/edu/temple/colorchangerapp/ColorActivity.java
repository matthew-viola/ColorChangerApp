package edu.temple.colorchangerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Magenta");
        colors.add("Green");
        colors.add("Cyan");
        colors.add("Gray");
        colors.add("Red");
        colors.add("White");
        colors.add("Dark Gray");

        final BaseAdapter color = new ColorAdapter(this, colors);

        
    }

}
