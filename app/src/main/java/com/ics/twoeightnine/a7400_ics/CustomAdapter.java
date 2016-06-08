package com.ics.twoeightnine.a7400_ics;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private ArrayList<Item> data;
    private LayoutInflater inf;

    public CustomAdapter(Context context, ArrayList<Item> data){
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(convertView == null)
            view = inf.inflate(R.layout.row, null);
        Item item = data.get(position);
        ((TextView) view.findViewById(R.id.name)).setText(item.getItemName());
        ((TextView) view.findViewById(R.id.desc)).setText(item.getDescription());
        return view;
    }
}
