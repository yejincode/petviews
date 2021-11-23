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

public class interestActivity extends AppCompatActivity {

    private ArrayList<interestdata> arrayList;
    private interestadapter interestadapter;
    private RecyclerView recyclerView_interest1;
    private LinearLayoutManager linearLayoutManager_interest1;

    private ArrayList<interestdata2> arrayList2;
    private interestadapter2 interestadapter2;
    private RecyclerView recyclerView_interest2;
    private LinearLayoutManager linearLayoutManager_interest2;

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
        setContentView(R.layout.activity_interest);

        //등록된 이물질
        recyclerView_interest1 = findViewById(R.id.recyclerview_interest);
        linearLayoutManager_interest1 = new LinearLayoutManager(this);
        linearLayoutManager_interest1.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView_interest1.setLayoutManager(linearLayoutManager_interest1);
        arrayList = new ArrayList<>();
        interestadapter = new interestadapter(arrayList);
        recyclerView_interest1.setAdapter(interestadapter);

        interestdata interestdata1 = new interestdata(R.drawable.choco,"초콜릿");
        arrayList.add(interestdata1);
        interestdata interestdata2 = new interestdata(R.drawable.cake,"케이크");
        arrayList.add(interestdata2);
        interestdata interestdata3 = new interestdata(R.drawable.bone,"뼈다귀");
        arrayList.add(interestdata3);
        interestdata interestdata4 = new interestdata(R.drawable.cigarette,"담배꽁초");
        arrayList.add(interestdata4);
        interestadapter.notifyDataSetChanged();


        //최근 관심사
        recyclerView_interest2 = findViewById(R.id.recyclerview_interest2);
        linearLayoutManager_interest2 = new LinearLayoutManager(this);
        linearLayoutManager_interest2.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView_interest2.setLayoutManager(linearLayoutManager_interest2);
        arrayList2 = new ArrayList<>();
        interestadapter2 = new interestadapter2(arrayList2);
        recyclerView_interest2.setAdapter(interestadapter2);

        interestdata2 interestdata2_1 = new interestdata2(R.drawable.choco,"최근 초콜릿에 8번 관심을 보였습니다.");
        arrayList2.add(interestdata2_1);
        interestdata2 interestdata2_2 = new interestdata2(R.drawable.cigarette,"최근 담배꽁초에 3번 관심을 보였습니다.");
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