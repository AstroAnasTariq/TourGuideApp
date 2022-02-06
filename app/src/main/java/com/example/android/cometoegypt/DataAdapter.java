package com.example.android.cometoegypt;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends ArrayAdapter<DataWord> {

    private int mColorResourceId;

    public DataAdapter(Activity context, ArrayList<DataWord> dataWord, int colorResourceId) {
        super(context, 0, dataWord);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listViewItem = convertView;

        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        DataWord currentData = getItem(position);

        View textContainer = listViewItem.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        TextView nameTextView = listViewItem.findViewById(R.id.name);
        nameTextView.setText(currentData.getName());

        TextView locationTextView =listViewItem.findViewById(R.id.location);
        locationTextView.setText(currentData.getLocation());

        ImageView imageView = listViewItem.findViewById(R.id.image);
        if (currentData.hasImage()) {
            imageView.setImageResource(currentData.getImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listViewItem;
    }
}
