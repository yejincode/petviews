package com.example.petviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class textpastvideoadapter extends BaseAdapter {

    private ImageView textpastvideo_image;
    private TextView textpastvideo_videotitle;
    private TextView textpastvideo_ago;

    //어댑터에 추가된 데이터를 저장하기 위한 arraylist
    private ArrayList<ListViewItem> listViewItemlist = new ArrayList<ListViewItem>();

    //textpastvideoadapter의 생성자
    public textpastvideoadapter(){

    }

    //어댑터에 사용되는 데이터 개수 리턴
    @Override
    public int getCount() {
        return listViewItemlist.size();
    }

    // 지정한 위치(position)에 있는 데이터 리턴
    @Override
    public Object getItem(int position) {
        return listViewItemlist.get(position);
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

        // "textpastvideo_list" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.textpastvideo_list, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        textpastvideo_image = (ImageView) convertView.findViewById(R.id.textpastvideo_image);
        textpastvideo_videotitle = (TextView) convertView.findViewById(R.id.textpastvideo_videotitle);
        textpastvideo_ago = (TextView) convertView.findViewById(R.id.textpastvideo_ago);

        ListViewItem listViewItem = listViewItemlist.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        textpastvideo_image.setImageResource(listViewItem.getIcon());
        textpastvideo_videotitle.setText(listViewItem.getTitle());
        textpastvideo_ago.setText(listViewItem.getContent());

        return convertView;
    }

    // 아이템 데이터 추가를 위한 함수.
    public void addItem(String title, int icon, String content) {
        ListViewItem item = new ListViewItem();

        item.setTitle(title);
        item.setIcon(icon);
        item.setContent(content);

        listViewItemlist.add(item);
    }
}
