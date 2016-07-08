package com.example.jamesrondina.project_1_todolist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jamesrondina on 7/8/16.
 */
public class MainViewHolder extends RecyclerView.ViewHolder {

    public TextView listName;
    public ImageView pokeball;

    public MainViewHolder(View itemView) {
        super(itemView);

        listName = (TextView) itemView.findViewById(R.id.listName);
        pokeball = (ImageView) itemView.findViewById(R.id.pokeball);

    }
}
