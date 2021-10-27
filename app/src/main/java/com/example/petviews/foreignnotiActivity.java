package com.example.petviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;


public class foreignnotiActivity extends AppCompatActivity {

    private ListView listview;
    private foreignnotiadapter adapter;

    //하단 네비바
    ImageButton tab_home;
    ImageButton tab_photo;
    ImageButton tab_camera;
    ImageButton tab_profile;

    //뒤로 가기
    ImageButton backButton;


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

        // 뒤로가기 버튼
        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            } //액티비티 종료시킴
        });

        // 하단 탭 홈버튼
        tab_home = findViewById(R.id.tab_home);
        tab_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),settingActivity.class);
                startActivity(intent);
            }
        });
    }
}