package edu.temple.colorchangerapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ColorAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> colors;

    public ColorAdapter(Context context, ArrayList<String> colors){
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount(){
        return colors.size();
    }

    @Override
    public Object getItem(int i){
        return colors.get(i);
    }

    @Override
    public long getItemId(int i){
        return 0;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup p){

        TextView textview = new TextView(context);
        textview.setText(colors.get(pos));
        textview.setBackgroundColor(Color.WHITE);
        return textview;


    }

    @Override
    public View getDropDownView(int pos, @Nullable View cv, @NonNull ViewGroup parent) {
        int c[] = new int[10];
        c[0] = Color.LTGRAY;
        c[1] = Color.BLUE;
        c[2] = Color.YELLOW;
        c[3] = Color.MAGENTA;
        c[4] = Color.GREEN;
        c[5] = Color.CYAN;
        c[6] = Color.GRAY;
        c[7] = Color.RED;
        c[8] = Color.WHITE;
        c[9] = Color.DKGRAY;
        View v = getView(pos, cv, parent);
        v.setBackgroundColor(c[pos]);
        return v;
    }
}
