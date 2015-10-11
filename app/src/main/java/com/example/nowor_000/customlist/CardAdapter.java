package com.example.nowor_000.customlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    List<NatureItem> mItems;

    public CardAdapter() {
        super();
        mItems = new ArrayList<NatureItem>();

        NatureItem nature = new NatureItem();

        nature.setName("The Great Barrier Reef");
        nature.setDes("text 1");
        nature.setThumbnail(R.drawable.feature);
        mItems.add(nature);

        nature = new NatureItem();
        nature.setName("Grand Canyon");
        nature.setDes("text 2");
        nature.setThumbnail(R.drawable.canyon);
        mItems.add(nature);

        nature = new NatureItem();
        nature.setName("Baltoro Glacier");
        nature.setDes("text 3");
        nature.setThumbnail(R.drawable.glaciar);
        mItems.add(nature);

        nature = new NatureItem();
        nature.setName("Iguazu Falls");
        nature.setDes("text 4");
        nature.setThumbnail(R.drawable.iguazu);
        mItems.add(nature);


        nature = new NatureItem();
        nature.setName("Aurora Borealis");
        nature.setDes("text 5");
        nature.setThumbnail(R.drawable.northernlights);
        mItems.add(nature);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view_card_item, viewGroup, false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        NatureItem nature = mItems.get(i);
        viewHolder.tvNature.setText(nature.getName());
        viewHolder.tvDesNature.setText(nature.getDes());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }



    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imgThumbnail;
        public TextView tvNature;
        public TextView tvDesNature;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvNature = (TextView)itemView.findViewById(R.id.tv_nature);
            tvDesNature = (TextView)itemView.findViewById(R.id.tv_des_nature);
        }
    }
}