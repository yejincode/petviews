package com.example.petviews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class interestadapter2 extends RecyclerView.Adapter<interestadapter2.CustomViewHolder> {

    private ArrayList<interestdata2> arrayList;

    public interestadapter2(ArrayList<interestdata2> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public interestadapter2.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //xml 파일 인플레이션해서 holder에 넣기기
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.interest_list,parent,false);
        CustomViewHolder holder = new CustomViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull interestadapter2.CustomViewHolder holder, int position) {
        holder.image_interest.setImageResource(arrayList.get(position).getImage_interest());
        holder.text_interesting.setText(arrayList.get(position).getText_interesting());

        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return (null != arrayList ? arrayList.size() :0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected ImageView image_interest;
        protected TextView text_interesting;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.image_interest = (ImageView) itemView.findViewById(R.id.image_interest);
            this.text_interesting = (TextView) itemView.findViewById(R.id.text_interesting);
        }
    }

    public void addArrayList(interestdata2 item){
        arrayList.add(item);
    }

    public void setArrayList(ArrayList<interestdata2> items){
        this.arrayList = items;
    }

    public interestdata2 getitem(int position){ return arrayList.get(position);}

    public void setItem(int position, interestdata2 item) {
        arrayList.set(position,item);
    }
}
