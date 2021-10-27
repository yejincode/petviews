package com.example.petviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class livevideoActivity extends AppCompatActivity {

    //뒤로 가기
    ImageButton backButton;

    //홈으로 돌아가기
    Button button_livetohome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livevideo);

        // 뒤로가기 버튼
        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            } //액티비티 종료시킴
        });

        //홈으로 돌아가기 버튼
        button_livetohome = findViewById(R.id.button_livetohome);
        button_livetohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), settingActivity.class);
                startActivity(intent);
            }
        });


    }
}