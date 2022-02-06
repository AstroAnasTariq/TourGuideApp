package com.example.android.cometoegypt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EntertaimentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(R.string.entertainment_name_1,R.string.entertainment_location_1, R.drawable.ic_movie_black_48dp));
        dataWord.add(new DataWord(R.string.entertainment_name_2,R.string.entertainment_location_2, R.drawable.ic_movie_black_48dp));
        dataWord.add(new DataWord(R.string.entertainment_name_3,R.string.entertainment_location_1, R.drawable.ic_movie_black_48dp));
        dataWord.add(new DataWord(R.string.entertainment_name_4,R.string.entertainment_location_1, R.drawable.ic_movie_black_48dp));
        dataWord.add(new DataWord(R.string.entertainment_name_5,R.string.entertainment_location_1, R.drawable.ic_movie_black_48dp));
        dataWord.add(new DataWord(R.string.entertainment_name_6,R.string.entertainment_location_1,R.drawable.ic_movie_black_48dp));
        dataWord.add(new DataWord(R.string.entertainment_name_7,R.string.entertainment_location_1,R.drawable.ic_movie_black_48dp));
        dataWord.add(new DataWord(R.string.entertainment_name_8,R.string.entertainment_location_1,R.drawable.ic_movie_black_48dp));
        dataWord.add(new DataWord(R.string.entertainment_name_9,R.string.entertainment_location_1,R.drawable.ic_movie_black_48dp));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_entertainment);
        ListView listView =findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
