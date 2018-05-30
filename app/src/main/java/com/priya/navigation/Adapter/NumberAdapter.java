package com.priya.navigation.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.priya.navigation.R;

public class NumberAdapter extends BaseAdapter {
    private String[] namelist;
    private Activity activity;
    public NumberAdapter(String[] namelist, Activity activity){

        this.activity=activity;
        this.namelist=namelist;

    }





    @Override
    public int getCount() {
        return namelist.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(activity).inflate(R.layout.list_item_number, parent, false);
        TextView textView = view.findViewById(R.id.nameTv);
        textView.setText(namelist[position]);

        return view;
    }

}