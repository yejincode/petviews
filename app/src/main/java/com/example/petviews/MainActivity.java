package com.example.petviews;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout_danger;
    LinearLayout layout_pastvideo;
    LinearLayout layout_interest;
    LinearLayout layout_livevideo;
    LinearLayout layout_highlight;

    // 하단 네비바
    ImageButton tab_home;
    ImageButton tab_photo;
    ImageButton tab_camera;
    ImageButton tab_profile;
    ImageView tab_search;

    //뒤로 가기
    ImageButton backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //위험 물질 추가 클릭이벤트 (인텐트 전환)
        layout_danger = findViewById(R.id.layout_danger);
        layout_danger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), cameraActivity.class);
                startActivity(intent);
            }
        });

        //과거 영상 조회 클릭이벤트 (인텐트 전환)
        layout_pastvideo = findViewById(R.id.layout_pastvideo);
        layout_pastvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), pastvideoActivity.class);
                startActivity(intent);
            }
        });

        //관심도 측정 클릭이벤트 (인텐트 전환)
        layout_interest = findViewById(R.id.layout_interest);
        layout_interest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), interestActivity.class);
                startActivity(intent);
            }
        });

        //실시간 영상 확인 클릭이벤트 (인텐트 전환)
        layout_livevideo = findViewById(R.id.layout_livevideo);
        layout_livevideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), livevideoActivity.class);
                startActivity(intent);
            }
        });

        //하이라이트 요약 클릭이벤트 (인텐트 전환)
        layout_highlight = findViewById(R.id.layout_highlight);
        layout_highlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), highlightActivity.class);
                startActivity(intent);
            }
        });

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