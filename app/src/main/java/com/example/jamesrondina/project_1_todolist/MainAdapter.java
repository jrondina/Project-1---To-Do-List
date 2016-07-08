package com.example.jamesrondina.project_1_todolist;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by jamesrondina on 7/8/16.
 */
public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    List<MainObject> mainObjectsList;

    public MainAdapter(final List<MainObject> mainObjects) {
        mainObjectsList = mainObjects;
    }


    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom1,
                parent, false);
        MainViewHolder viewHolder = new MainViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MainViewHolder holder, final int position) {
        holder.listName.setText(mainObjectsList.get(position).getListName()); //TODO: change this later to get name of list from position

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(view.getContext(), "clicked " + mainObjectsList.get(position).getListName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), SecondActivity.class);
                intent.putStringArrayListExtra(mainObjectsList.get(position).getListName(),null);
                view.getContext().startActivity(intent);


            }

        };

        /*View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

            }
        };*/


        holder.listName.setOnClickListener(onClickListener);
    }

    @Override
    public int getItemCount() {
        return mainObjectsList.size();
    }
}
