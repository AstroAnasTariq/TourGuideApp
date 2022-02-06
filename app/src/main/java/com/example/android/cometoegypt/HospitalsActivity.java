package com.example.android.cometoegypt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HospitalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(R.string.hospital_name_1,R.string.hospital_location_1,R.drawable.ic_local_hospital_black_48dp));
        dataWord.add(new DataWord(R.string.hospital_name_2,R.string.hospital_location_1,R.drawable.ic_local_hospital_black_48dp));
        dataWord.add(new DataWord(R.string.hospital_name_3,R.string.hospital_location_2,R.drawable.ic_local_hospital_black_48dp));
        dataWord.add(new DataWord(R.string.hospital_name_4,R.string.hospital_location_3,R.drawable.ic_local_hospital_black_48dp));
        dataWord.add(new DataWord(R.string.hospital_name_5,R.string.hospital_location_4,R.drawable.ic_local_hospital_black_48dp));
        dataWord.add(new DataWord(R.string.hospital_name_6,R.string.hospital_location_5,R.drawable.ic_local_hospital_black_48dp));
        dataWord.add(new DataWord(R.string.hospital_name_7,R.string.hospital_location_6,R.drawable.ic_local_hospital_black_48dp));
        dataWord.add(new DataWord(R.string.hospital_name_1,R.string.hospital_location_7,R.drawable.ic_local_hospital_black_48dp));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_hospitals);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}