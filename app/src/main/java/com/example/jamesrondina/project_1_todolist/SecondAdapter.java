package com.example.jamesrondina.project_1_todolist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by jamesrondina on 7/8/16.
 */
public class SecondAdapter extends RecyclerView.Adapter<SecondViewHolder> {

    List<SecondObject> secondObjectList;

    public SecondAdapter(final List<SecondObject> secondObjects) {
        secondObjectList = secondObjects;
    }

    @Override
    public SecondViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom2,
                parent, false);
        SecondViewHolder viewHolder = new SecondViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SecondViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
