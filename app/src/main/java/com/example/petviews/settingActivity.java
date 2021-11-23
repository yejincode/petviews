package com.example.petviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.VideoView;

public class settingActivity extends AppCompatActivity {

    private ListView listview ;
    private textpastvideoadapter adapter;

    //뒤로 가기
    ImageButton backButton;

    // 하단 네비바
    ImageButton tab_home;
    ImageButton tab_photo;
    ImageButton tab_camera;
    ImageButton tab_profile;
    ImageView tab_search;

    //비디오뷰
    VideoView setting_VideoView;

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

        // 비디오 추가
        // 비디오뷰 가져오기
        setting_VideoView = (VideoView) findViewById(R.id.livevideo2);
        // sample.mp4 설정
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/"+ R.raw.video1);
        setting_VideoView.setVideoURI(uri);
        // 리스너 등록
        setting_VideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                // 준비 완료되면 비디오 재생
                mp.start();
            }
        });


        adapter.addItem("바다랑 산책간 날", R.drawable.profile_pic, "2주 전");  //(제목 부분, 이미지, 내용)
        adapter.addItem("집에서 뒹구는 바다", R.drawable.profile_pic2, "한달 전");

        adapter.notifyDataSetChanged(); //어댑터의 변경을 알림.

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