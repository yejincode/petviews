package com.example.petviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class interestActivity extends AppCompatActivity {

    private ArrayList<interestdata> arrayList;
    private interestadapter interestadapter;
    private RecyclerView recyclerView_interest1;
    private LinearLayoutManager linearLayoutManager_interest1;

    private ArrayList<interestdata2> arrayList2;
    private interestadapter2 interestadapter2;
    private RecyclerView recyclerView_interest2;
    private LinearLayoutManager linearLayoutManager_interest2;

    ImageButton tab_home;
    ImageButton tab_photo;
    ImageButton tab_camera;
    ImageButton tab_profile;

    //뒤로 가기
    ImageButton backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);

        //등록된 이물질
        recyclerView_interest1 = findViewById(R.id.recyclerview_interest);
        linearLayoutManager_interest1 = new LinearLayoutManager(this);
        linearLayoutManager_interest1.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView_interest1.setLayoutManager(linearLayoutManager_interest1);
        arrayList = new ArrayList<>();
        interestadapter = new interestadapter(arrayList);
        recyclerView_interest1.setAdapter(interestadapter);

        interestdata interestdata1 = new interestdata(R.drawable.basic_image,"초콜릿");
        arrayList.add(interestdata1);
        interestdata interestdata2 = new interestdata(R.drawable.basic_image,"사탕");
        arrayList.add(interestdata2);
        interestadapter.notifyDataSetChanged();


        //최근 관심사
        recyclerView_interest2 = findViewById(R.id.recyclerview_interest2);
        linearLayoutManager_interest2 = new LinearLayoutManager(this);
        linearLayoutManager_interest2.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView_interest2.setLayoutManager(linearLayoutManager_interest2);
        arrayList2 = new ArrayList<>();
        interestadapter2 = new interestadapter2(arrayList2);
        recyclerView_interest2.setAdapter(interestadapter2);

        interestdata2 interestdata2_1 = new interestdata2(R.drawable.basic_image,"초콜릿 8번");
        arrayList2.add(interestdata2_1);
        interestdata2 interestdata2_2 = new interestdata2(R.drawable.basic_image,"사탕 7번");
        arrayList2.add(interestdata2_2);
        interestadapter.notifyDataSetChanged();

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
                Intent intent = new Intent(view.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}