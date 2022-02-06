package com.example.android.cometoegypt;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(R.string.restaurant_name_1, R.string.restaurant_location_1, R.drawable.leftbank));
        dataWord.add(new DataWord(R.string.restaurant_name_2, R.string.restaurant_location_2, R.drawable.mirai));
        dataWord.add(new DataWord(R.string.restaurant_name_3, R.string.restaurant_location_3, R.drawable.sequoia));
        dataWord.add(new DataWord(R.string.restaurant_name_4, R.string.restaurant_location_4, R.drawable.thegrill));
        dataWord.add(new DataWord(R.string.restaurant_name_5, R.string.restaurant_location_5, R.drawable.sagion));
        dataWord.add(new DataWord(R.string.restaurant_name_6, R.string.restaurant_location_6, R.drawable.thesmokery));
        dataWord.add(new DataWord(R.string.restaurant_name_7, R.string.restaurant_location_7, R.drawable.carlos));
        dataWord.add(new DataWord(R.string.restaurant_name_8, R.string.restaurant_location_8, R.drawable.esplande));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.color_restaurant);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
