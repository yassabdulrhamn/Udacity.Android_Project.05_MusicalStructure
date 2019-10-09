package com.example.ranyass.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class CountryAdapter extends BaseAdapter {

    private String[] Name;
    private Integer[] Image;
    private static LayoutInflater inFla = null;
    Context con;
    public CountryAdapter(Context c, String[] n){
        con = c;
        Name = n;
        inFla = (LayoutInflater)con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return Name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View MyView = view;
        if(view==null)
            MyView = inFla.inflate(R.layout.gridview_layout,null);
        TextView  CountryName = (TextView) MyView.findViewById(R.id.flag_name);
        String country_name = Name[i];
        CountryName.setText(country_name);
        ImageView CountryImage = (ImageView) MyView.findViewById(R.id.flag_image);
        CountryImage.setImageResource(Data.covers[i]);
        
        return MyView;
    }

}