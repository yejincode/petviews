package com.example.petviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

public class settingActivity extends AppCompatActivity {

    private ListView listview ;
    private textpastvideoadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        // Adapter 생성
        adapter = new textpastvideoadapter();

        // 리스트뷰 참조 및 Adapter 달기
        listview = (ListView) findViewById(R.id.pastvideo_listview);
        listview.setAdapter(adapter);
        //listview.setOnItemClickListener(listener);

        adapter.addItem("제목1", R.drawable.user, "내용1");  //(제목 부분, 이미지, 내용)
        adapter.addItem("제목2", R.drawable.user, "내용2");

        adapter.notifyDataSetChanged(); //어댑터의 변경을 알림.
    }
}