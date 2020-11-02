package com.sanju.realtimesqldata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class AdapterItem extends RecyclerView.Adapter<AdapterItem.ItemViewHolder> {
    Context context;
    ArrayList<dataUser> dataUserArrayList;
    Locale id = new Locale("in","ID");
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy",id);

    public AdapterItem(Context context, ArrayList<dataUser> dataUserArrayList){
        this.context = context;
        this.dataUserArrayList = dataUserArrayList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.viewBind(dataUserArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataUserArrayList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name,tv_gender,tv_title,tv_date;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_gender = itemView.findViewById(R.id.tv_gender);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_date = itemView.findViewById(R.id.tv_date);
        }

        public void viewBind(dataUser dataUser) {
            tv_name.setText(dataUser.getName());
            tv_gender.setText(dataUser.getGender());
            tv_title.setText(dataUser.getTitle());
            tv_date.setText(simpleDateFormat.format(dataUser.getTime()));
        }
    }
}
