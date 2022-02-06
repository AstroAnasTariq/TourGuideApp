package com.example.android.cometoegypt;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    public HotelsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(R.string.hotel_name_1, R.string.hotel_location_1, R.drawable.aracanpyramidshotel));
        dataWord.add(new DataWord(R.string.hotel_name_2, R.string.hotel_location_2, R.drawable.menainn));
        dataWord.add(new DataWord(R.string.hotel_name_3, R.string.hotel_location_3, R.drawable.soluxecairohotel));
        dataWord.add(new DataWord(R.string.hotel_name_4, R.string.hotel_location_4, R.drawable.ic_hotel_black_48dp));
        dataWord.add(new DataWord(R.string.hotel_name_5, R.string.hotel_location_5, R.drawable.swissinnhotelcairo));
        dataWord.add(new DataWord(R.string.hotel_name_6, R.string.hotel_location_6, R.drawable.pyramidslofthomestay));
        dataWord.add(new DataWord(R.string.hotel_name_7, R.string.hotel_location_7, R.drawable.safirhotelcairo));
        dataWord.add(new DataWord(R.string.hotel_name_8, R.string.hotel_location_8, R.drawable.almasahotel));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.color_restaurant);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
