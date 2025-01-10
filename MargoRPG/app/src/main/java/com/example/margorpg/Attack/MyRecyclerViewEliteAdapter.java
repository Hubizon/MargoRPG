package com.example.margorpg.Attack;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.margorpg.R;

import java.util.ArrayList;


public class MyRecyclerViewEliteAdapter extends RecyclerView.Adapter<MyRecyclerViewEliteAdapter.ViewHolder> {

    private Context context;
    private ArrayList<String> mEliteNames;
    private ArrayList<String> mEliteLvls;
    private ArrayList<Integer> mEliteEnvis;
    private ArrayList<Drawable> mEliteImages;
    private LayoutInflater mInflater;
    private MyRecyclerViewEliteAdapter.ItemClickListener mClickListener;

    MyRecyclerViewEliteAdapter(Context context, ArrayList<String> eliteNames, ArrayList<String> eliteLvls, ArrayList<Integer> eliteEnvis, ArrayList<Drawable> eliteImages) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);

        this.mEliteNames = eliteNames;
        this.mEliteLvls = eliteLvls;
        this.mEliteEnvis = eliteEnvis;
        this.mEliteImages = eliteImages;
    }

    @Override
    public MyRecyclerViewEliteAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.rv_attack_elite_row, parent, false);
        return new MyRecyclerViewEliteAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewEliteAdapter.ViewHolder holder, int position) {
        String eliteName = mEliteNames.get(position);
        holder.myTextViewName.setText(eliteName);
        String eliteLvl = mEliteLvls.get(position);
        holder.myTextViewLvl.setText(eliteLvl);
        Drawable eliteEnvi = context.getResources().getDrawable(mEliteEnvis.get(position));
        holder.myImageViewEnvi.setBackground(eliteEnvi);
        Drawable eliteImage = mEliteImages.get(position);
        Glide.with(context).load(eliteImage).into(holder.myImageViewImage);
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return mEliteNames.size();
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myTextViewName;
        TextView myTextViewLvl;
        ImageView myImageViewEnvi;
        ImageView myImageViewImage;

        ViewHolder(View itemView) {
            super(itemView);
            myTextViewName = itemView.findViewById(R.id.eliteName);
            myTextViewLvl = itemView.findViewById(R.id.eliteLvl);
            myImageViewEnvi = itemView.findViewById(R.id.enemyEliteEnvironment);
            myImageViewImage = itemView.findViewById(R.id.eliteImage);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    int getItem(int id) {
        return mEliteEnvis.get(id);
    }

    void setClickListener(MyRecyclerViewEliteAdapter.ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
