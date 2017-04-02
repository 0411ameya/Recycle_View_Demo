package com.ameya.recyclerlist.adapter;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ameya.recyclerlist.R;
import com.ameya.recyclerlist.model.ListItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 0411a on 3/31/2017.
 */

public class DataAdapter extends RecyclerView.Adapter <DataAdapter.DataHolder>{

    private List <ListItem> listData;
    private LayoutInflater inflater;

    private ItemClickCallback itemClickCallback;

    public interface ItemClickCallback {
        void onItemClick(int p);
        void onSecondaryIconClick(int p);
    }

    public void setItemClickCallback(final ItemClickCallback itemClickCallback) {
        this.itemClickCallback = itemClickCallback;
    }

    public DataAdapter(List <ListItem> listData, Context c){
        inflater = LayoutInflater.from(c);
        this.listData = listData;
    }

    @Override
    public DataAdapter.DataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new DataHolder(view);
    }

    @Override
    public void onBindViewHolder(DataHolder holder, int position) {
        ListItem item = listData.get(position);
        holder.title.setText(item.getTitle());
        holder.subTitle.setText(item.getSubTitle());
        if (item.isFavorite()){
            holder.secondaryIcon.setImageResource(R.drawable.ic_star_black_24dp);
        } else {
            holder.secondaryIcon.setImageResource(R.drawable.ic_star_border_black_24dp);
        }
    }

    public void setListData(ArrayList <ListItem> exerciseList) {
        this.listData.clear();
        this.listData.addAll(exerciseList);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class DataHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView thumbnail;
        ImageView secondaryIcon;
        TextView title;
        TextView subTitle;
        View container;

        public DataHolder(View itemView) {
            super(itemView);
            thumbnail = (ImageView)itemView.findViewById(R.id.im_item_icon);
            secondaryIcon = (ImageView)itemView.findViewById(R.id.im_item_icon_secondary);
            secondaryIcon.setOnClickListener(this);
            subTitle = (TextView)itemView.findViewById(R.id.lbl_item_sub_title);
            title = (TextView)itemView.findViewById(R.id.lbl_item_text);
            container = (View)itemView.findViewById(R.id.cont_item_root);
            container.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.cont_item_root){
                itemClickCallback.onItemClick(getAdapterPosition());
            } else {
                itemClickCallback.onSecondaryIconClick(getAdapterPosition());
            }
        }
    }
}