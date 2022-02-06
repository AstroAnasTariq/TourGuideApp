package com.example.android.cometoegypt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalLocationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(R.string.historical_name_1,R.string.historical_location_1,R.drawable.pyramids));
        dataWord.add(new DataWord(R.string.historical_name_2,R.string.historical_location_2,R.drawable.steppyramid));
        dataWord.add(new DataWord(R.string.historical_name_3,R.string.historical_location_3,R.drawable.karnak));
        dataWord.add(new DataWord(R.string.historical_name_4,R.string.historical_location_4,R.drawable.templeofhatshepsut));
        dataWord.add(new DataWord(R.string.historical_name_5,R.string.historical_location_5,R.drawable.esna));
        dataWord.add(new DataWord(R.string.historical_name_6,R.string.historical_location_6,R.drawable.kom));
        dataWord.add(new DataWord(R.string.historical_name_7,R.string.historical_location_7,R.drawable.philae));
        dataWord.add(new DataWord(R.string.historical_name_8,R.string.historical_location_8,R.drawable.abusimbel));
        dataWord.add(new DataWord(R.string.historical_name_9,R.string.historical_location_9,R.drawable.mosque));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_historical);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
