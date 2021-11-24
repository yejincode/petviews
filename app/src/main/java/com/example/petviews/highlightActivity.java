package com.example.petviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class highlightActivity extends AppCompatActivity {

    private ArrayList<videodata> arrayList;
    private videoadapter videoadapter1;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    private ArrayList<videodata> arrayList2;
    private videoadapter2 videoadapter2;
    private RecyclerView recyclerView2;
    private LinearLayoutManager linearLayoutManager2;

    //뒤로 가기
    ImageButton backButton;

    // 하단 네비바
    ImageButton tab_home;
    ImageButton tab_photo;
    ImageButton tab_camera;
    ImageButton tab_profile;
    ImageView tab_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highlight);

        //최근영상
        recyclerView = findViewById(R.id.recyclerview_recent);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        arrayList = new ArrayList<>();
        videoadapter1 = new videoadapter(arrayList);
        recyclerView.setAdapter(videoadapter1);

        videodata videodata = new videodata(R.drawable.capture1,"집 근처 산책");
        arrayList.add(videodata);
        videodata videodata2 = new videodata(R.drawable.capture2,"엑스포 산책");
        arrayList.add(videodata2);
        videodata videodata3 = new videodata(R.drawable.capture3,"산책");
        arrayList.add(videodata3);
        videodata videodata4 = new videodata(R.drawable.capture4,"신났음");
        arrayList.add(videodata4);
        videodata videodata5 = new videodata(R.drawable.capture5,"산책 중");
        arrayList.add(videodata5);
        videoadapter1.notifyDataSetChanged();

        //과거영상
        recyclerView2 = findViewById(R.id.recyclerview_past);
        linearLayoutManager2 = new LinearLayoutManager(this);
        linearLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        arrayList2 = new ArrayList<>();
        videoadapter2 = new videoadapter2(arrayList2);
        recyclerView2.setAdapter(videoadapter2);

        videodata videodata6 = new videodata(R.drawable.capture6,"놀러가서");
        arrayList2.add(videodata6);
        videodata videodata7 = new videodata(R.drawable.capture7,"서울");
        arrayList2.add(videodata7);
        videodata videodata8 = new videodata(R.drawable.capture8,"집 앞에서");
        arrayList2.add(videodata8);
        videodata videodata9 = new videodata(R.drawable.capture9,"하이텐션");
        arrayList2.add(videodata9);
        videodata videodata10 = new videodata(R.drawable.capture10,"멍멍");
        arrayList2.add(videodata10);
        videoadapter2.notifyDataSetChanged();

        // 뒤로가기 버튼
        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            } //액티비티 종료시킴
        });

        // 하단 탭

        // 하단 탭 홈버튼
        tab_home = findViewById(R.id.tab_home);
        tab_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //반려견의 화면(메인)
                Intent intent = new Intent(view.getContext(),settingActivity.class);
                startActivity(intent);
            }
        });

        // 하단 탭 그래프버튼
        tab_photo = findViewById(R.id.tab_photo);
        tab_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //관심도 측정
                Intent intent = new Intent(view.getContext(),interestActivity.class);
                startActivity(intent);
            }
        });

        // 하단 탭 카메라버튼
        tab_camera = findViewById(R.id.tab_camera);
        tab_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //이물질 추가
                Intent intent = new Intent(view.getContext(),cameraActivity.class);
                startActivity(intent);
            }
        });

        // 하단 탭 프로필버튼
        tab_profile = findViewById(R.id.tab_profile);
        tab_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //프로필 화면
                Intent intent = new Intent(view.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        // 하단 탭 돋보기버튼
        tab_search = findViewById(R.id.tab_search);
        tab_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { //이물알림 화면
                Intent intent = new Intent(view.getContext(),foreignnotiActivity.class);
                startActivity(intent);
            }
        });


    }
}