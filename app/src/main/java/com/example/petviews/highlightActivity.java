package com.example.petviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

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

    ImageButton tab_home;

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

        videodata videodata = new videodata(R.drawable.basic_image,"sample");
        arrayList.add(videodata);
        videodata videodata2 = new videodata(R.drawable.basic_image,"sample");
        arrayList.add(videodata2);
        videoadapter1.notifyDataSetChanged();

        //과거영상
        recyclerView2 = findViewById(R.id.recyclerview_past);
        linearLayoutManager2 = new LinearLayoutManager(this);
        linearLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        arrayList2 = new ArrayList<>();
        videoadapter2 = new videoadapter2(arrayList2);
        recyclerView2.setAdapter(videoadapter2);

        videodata videodata3 = new videodata(R.drawable.basic_image,"sample");
        arrayList2.add(videodata3);
        videodata videodata4 = new videodata(R.drawable.basic_image,"sample");
        arrayList2.add(videodata4);
        videoadapter2.notifyDataSetChanged();

        // 하단 탭 홈버튼
        tab_home = findViewById(R.id.tab_home);
        tab_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });


    }
}