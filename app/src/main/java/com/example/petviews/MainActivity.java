package com.example.petviews;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout_danger;
    LinearLayout layout_pastvideo;
    LinearLayout layout_interest;
    LinearLayout layout_livevideo;
    LinearLayout layout_highlight;

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
    }




}