package com.example.petviews;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class pastvideoActivity extends Activity {

    //뒤로 가기
    ImageButton backButton;

    //이물질 탐색하기
    Button button_explore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastvideo);

        // 뒤로가기 버튼
        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            } //액티비티 종료시킴
        });

        //이물질 탐색하기 버튼 -> 누르면 어케 됨?.? 일단 이물질 등록하는 액티비티로 등록할게용
        button_explore = findViewById(R.id.button_explore);
        button_explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), cameraActivity.class);
                startActivity(intent);
            }
        });
    }
}
