package edu.temple.colorchangerapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ColorAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> colors;
    public ColorAdapter(Activity context, ArrayList<String> colors){
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount(){
        return colors.size();
    }

    @Override
    public Object getItem(int i){
        return colors.get((i));
    }

    @Override
    public long getItemId(int i){
        return 0;
    }

    @Override
    public View getView(int pos, View cv, ViewGroup p){

        int colors[] = new int[9];
        colors[0] = Color.BLACK;
        colors[1] = Color.BLUE;
        colors[2] = Color.YELLOW;
        colors[3] = Color.MAGENTA;
        colors[4] = Color.GREEN;
        colors[5] = Color.CYAN;
        colors[6] = Color.GRAY;
        colors[7] = Color.RED;
        colors[8] = Color.WHITE;
        colors[9] = Color.DKGRAY;

        TextView theview = new TextView(context);
        theview.setText(getItem(pos).toString());
        theview.setBackgroundColor(colors[pos]);


        return theview;
    }
}
