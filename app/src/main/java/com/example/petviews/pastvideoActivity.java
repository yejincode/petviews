package com.example.petviews;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pastvideoActivity extends Activity {

    ImageButton backButton_pastvideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastvideo);

        // 뒤로가기 버튼
        backButton_pastvideo = findViewById(R.id.backButton_pastvideo);
        backButton_pastvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
