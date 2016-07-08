package com.example.jamesrondina.project_1_todolist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jamesrondina on 7/8/16.
 */
public class SecondViewHolder extends RecyclerView.ViewHolder {

    public TextView listName2;
    public TextView description;


    public SecondViewHolder(View itemView) {
        super(itemView);

        listName2 = (TextView) itemView.findViewById(R.id.listName2);
        description = (TextView) itemView.findViewById(R.id.description);
    }
}
