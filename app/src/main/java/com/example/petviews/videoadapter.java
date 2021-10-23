package com.example.petviews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class videoadapter extends RecyclerView.Adapter<videoadapter.CustomViewHolder> {

    private ArrayList<videodata> arrayList;

    public videoadapter(ArrayList<videodata> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public videoadapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //xml 파일 인플레이션해서 holder에 넣기기
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_list,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull videoadapter.CustomViewHolder holder, int position) {
        holder.image_video.setImageResource(arrayList.get(position).getImage_video());
        holder.video_title.setText(arrayList.get(position).getVideo_title());

        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() :0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected ImageView image_video;
        protected TextView video_title;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.image_video = (ImageView) itemView.findViewById(R.id.image_video);
            this.video_title = (TextView) itemView.findViewById(R.id.video_title);
        }
    }

    public void addArrayList(videodata item){
        arrayList.add(item);
    }

    public void setArrayList(ArrayList<videodata> items){
        this.arrayList = items;
    }

    public videodata getitem(int position){
        return arrayList.get(position);
    }

    public void setItem(int position, videodata item) {
        arrayList.set(position,item);
    }
}
