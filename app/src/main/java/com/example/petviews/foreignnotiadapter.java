package com.example.petviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class foreignnotiadapter extends BaseAdapter {

    private ImageView foreignnoti_image;
    private TextView foreignnoti_text;
    private TextView foreignnoti_dt;

    //어댑터에 추가된 데이터를 저장하기 위한 arraylist
    private ArrayList<foreignnotiitem> foreignnotiitemlist = new ArrayList<foreignnotiitem>();

    //foreignnotiadapter 생성자
    public foreignnotiadapter(){

    }

    //어댑터에 사용되는 데이터 개수 리턴
    @Override
    public int getCount() {
        return foreignnotiitemlist.size();
    }

    // 지정한 위치(position)에 있는 데이터 리턴
    @Override
    public Object getItem(int position) {
        return foreignnotiitemlist.get(position);
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴
    @Override
    public long getItemId(int position) {
        return position;
    }

    //position에 위치한 데이터를 화면에 출력하는데 사용될 view 리턴
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "foreignnoti_list" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.foreignnoti_list, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        foreignnoti_image = (ImageView) convertView.findViewById(R.id.foreignnoti_image);
        foreignnoti_text = (TextView) convertView.findViewById(R.id.foreignnoti_text);
        foreignnoti_dt = (TextView) convertView.findViewById(R.id.foreignnoti_dt);

        foreignnotiitem foreignnotiitem = foreignnotiitemlist.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        foreignnoti_image.setImageResource(foreignnotiitem.getIcon());
        foreignnoti_text.setText(foreignnotiitem.getTitle());
        foreignnoti_dt.setText(foreignnotiitem.getContent());

        return convertView;
    }

    // 아이템 데이터 추가를 위한 함수.
    public void addItem(String title, int icon, String content) {
        foreignnotiitem item = new foreignnotiitem();

        item.setTitle(title);
        item.setIcon(icon);
        item.setContent(content);

        foreignnotiitemlist.add(item);
    }
}
