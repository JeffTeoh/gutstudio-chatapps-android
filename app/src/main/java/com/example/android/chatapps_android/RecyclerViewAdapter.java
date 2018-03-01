package com.example.android.chatapps_android;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jeffrey on 3/1/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    ArrayList<Contact> mData;

    public RecyclerViewAdapter(Context mContext, ArrayList<Contact> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_contact, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_status.setText(mData.get(position).getStatus());
        holder.img.setImageResource(mData.get(position).getPhoto());



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_name;
        private TextView tv_status;
        private ImageView img;


        public MyViewHolder(View itemView) {
            super(itemView);

            tv_name = (TextView) itemView.findViewById(R.id.name_contact);
            tv_status = (TextView) itemView.findViewById(R.id.status_contact);
            img = (ImageView) itemView.findViewById(R.id.img_contact);


        }
    }

}
