package com.example.petviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class livevideoActivity extends AppCompatActivity {

    ImageButton backButton_livevideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livevideo);

        // 뒤로가기 버튼
        backButton_livevideo = findViewById(R.id.backButton_livevideo);
        backButton_livevideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}