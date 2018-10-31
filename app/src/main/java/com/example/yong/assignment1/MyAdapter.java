package com.example.yong.assignment1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdapter extends BaseAdapter {
    private Context mContext;
    private int mResource;
    private ArrayList<MyItem> mItems = new ArrayList<MyItem>();

    public MyAdapter(Context context, int resource, ArrayList<MyItem> items) {
        mContext = context;
        mItems = items;
        mResource = resource;
    }


    public int getCount() {
        return mItems.size();
    }


    public Object getItem(int position) {
        return mItems.get(position);
    }


    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(mResource, parent,false);
        }
        // Set Icon
        ImageView icon = (ImageView) convertView.findViewById(R.id.iconItem);
        icon.setImageResource(mItems.get(position).mIcon);

        // Set Text 01
        TextView Location = (TextView) convertView.findViewById(R.id.textItem1);
        Location.setText(mItems.get(position).nLocation);

        // Set Text 02
        TextView Capacity = (TextView) convertView.findViewById(R.id.textItem2);
        Capacity.setText(mItems.get(position).nCapacity);

        return convertView;
    }
}

class MyItem {

    int mIcon; // image resource
    String nLocation; // text
    String nCapacity;  // text

    MyItem(int aIcon, String aLocation, String aCapacity) {
        mIcon = aIcon;
        nLocation = aLocation;
        nCapacity = aCapacity;
    }
}
