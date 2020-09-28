package edu.temple.colorchangerapp;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class ColorAdapter extends BaseAdapter {

    public String color;
    public ColorAdapter(Activity context, List<String> colors){
    }

    @Override
    public int getCount(){
        return 0;
    }

    @Override
    public String getItem(int i){
        return color;
    }

    @Override
    public long getItemId(int i){
        return 0;
    }

    @Override
    public View getView(int pos, View cv, ViewGroup vg){
        return cv;
    }
}
