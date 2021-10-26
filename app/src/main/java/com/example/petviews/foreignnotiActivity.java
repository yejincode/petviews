package com.example.petviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


public class foreignnotiActivity extends AppCompatActivity {

    private ListView listview;
    private foreignnotiadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreignnoti);

        // Adapter 생성
        adapter = new foreignnotiadapter();

        // 리스트뷰 참조 및 Adapter 달기
        listview = (ListView) findViewById(R.id.foreignnoti_listview);
        listview.setAdapter(adapter);
        //listview.setOnItemClickListener(listener);

        adapter.addItem("이물질을 탐지했습니다.", R.drawable.user, "2m/sc");
        adapter.addItem("이물질을 탐지했습니다.", R.drawable.user, "2m/sc");

        adapter.notifyDataSetChanged(); //어댑터의 변경을 알림.
    }
}