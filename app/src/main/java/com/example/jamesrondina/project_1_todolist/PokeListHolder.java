package com.example.jamesrondina.project_1_todolist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jamesrondina on 7/18/16.
 */
public class PokeListHolder extends RecyclerView.ViewHolder {

    TextView mNameView;

    public PokeListHolder(View itemView) {
        super(itemView);

        mNameView = (TextView) itemView.findViewById(R.id.listName);

    }
}
