package com.example.petviews;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.File;

public class cameraActivity extends AppCompatActivity {

    ImageView image_danger;
    File file;
    private Uri uri; //빼먹은 건가 에러나서 추가해봄,,,

    ImageButton tab_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        image_danger = findViewById(R.id.image_danger);

        Button button_photo = findViewById(R.id.button_photo);
        button_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                takePicture();
            }
        });

        // 하단 탭

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

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);

        if(requestCode == 101 && resultCode == RESULT_OK){
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(),options); //이미지파일을 비트맵으로 만듦.

            image_danger.setImageBitmap(bitmap); //이미지뷰에 비트맵 설정
        }
    }

    public void takePicture() {
        try {
            file = createFile();
            if(file.exists()){
                file.delete();
            }

            file.createNewFile();
        }catch(Exception e){
            e.printStackTrace();
        }

        if(Build.VERSION.SDK_INT>=24){
            uri = FileProvider.getUriForFile(this,BuildConfig.APPLICATION_ID,file);
        }else{
            uri= Uri.fromFile(file);
        }

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        intent.putExtra(MediaStore.EXTRA_OUTPUT,uri);
        startActivityForResult(intent,101); //사진 찍기 화면 띄우기
    }

    private File createFile(){
        String filename = "capture.jpg";
        File outFile = new File(getFilesDir(),filename);
        Log.d("Main","File path : " +outFile.getAbsolutePath());

        return outFile;

    }
}