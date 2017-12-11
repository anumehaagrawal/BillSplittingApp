package com.example.sanjana.codesprint;

/**
 * Created by Sanjana on 11/12/17.
 */


import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import java.util.*;
import android.view.*;
import android.content.*;


public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<Item> itemModelList;
    public CustomAdapter(Context context, ArrayList<Item> modelList) {
        this.context = context;
        this.itemModelList = modelList;
    }
    @Override
    public int getCount() {
        return itemModelList.size();
    }
    @Override
    public Object getItem(int position) {
        return itemModelList.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = null;
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.item, null);
            TextView item = (TextView) convertView.findViewById(R.id.item);
            TextView price = (TextView) convertView.findViewById(R.id.price);
            Item m = itemModelList.get(position);
            item.setText(m.getItem());
            price.setText(m.getPrice().toString());

        }
        return convertView;
    }
}