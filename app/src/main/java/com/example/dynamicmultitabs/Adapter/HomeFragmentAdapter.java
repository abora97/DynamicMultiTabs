package com.example.dynamicmultitabs.Adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dynamicmultitabs.R;

import java.util.List;

public class HomeFragmentAdapter extends RecyclerView.Adapter<HomeFragmentAdapter.MyHolder> {

    List<String> barachClubs;
    Context context;

    public HomeFragmentAdapter(List<String> barachClubs, Context context) {
        this.barachClubs = barachClubs;
        this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_rec_home, viewGroup, false);
        return new MyHolder(inflate);
    }

    @Override
    public void onBindViewHolder(MyHolder myHolder, int i) {




    }

    @Override
    public int getItemCount() {
        return barachClubs.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        public MyHolder(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_home_rec);
            textView=itemView.findViewById(R.id.text_home_rec);
        }
    }
}
