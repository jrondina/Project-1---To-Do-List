package com.example.jamesrondina.project_1_todolist;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

/**
 * Created by jamesrondina on 7/18/16.
 */
public class PokeListAdapter extends RecyclerView.Adapter<PokeListHolder>{
    List<PokeList> mPokeLists;

    public PokeListAdapter(List<PokeList> mPokeLists) {
        this.mPokeLists = mPokeLists;
    }

    @Override
    public PokeListHolder onCreateViewHolder(ViewGroup parent, int viewType) {

<<<<<<< HEAD
        //LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        //View parentView = inflater.inflate(R.layout.custom, parent, false);

        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom,
                parent, false);


        PokeListHolder pokeListHolder = new PokeListHolder(parentView);

        return pokeListHolder;
    }

    @Override
    public void onBindViewHolder(PokeListHolder holder, int position) {

        final int pos = position;
        final PokeList pokeList = mPokeLists.get(pos);
=======
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom, parent, false);

        PokeListHolder pokeHolder = new PokeListHolder(parentView);

        return pokeHolder;
    }

    @Override
    public void onBindViewHolder(PokeListHolder holder, final int position) {

        final PokeList pokeList = mPokeLists.get(position);
>>>>>>> 4756fc949a36319e8f9c1f6501f61f4de5b14edc

        holder.mNameView.setText(pokeList.getmName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), ToCatchAPokemon.class);
<<<<<<< HEAD
                intent.putExtra("listPosition", pos);
                intent.putExtra("Name", pokeList.getmName());
=======
                intent.putExtra("listPosition", position);
                intent.putExtra("Name", PokeList.getmName());
>>>>>>> 4756fc949a36319e8f9c1f6501f61f4de5b14edc
                view.getContext().startActivity(intent);

            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                editListDetail(pokeList, view).show();

                return false;
            }
        });
    }


    private AlertDialog editListDetail(final PokeList pokeList, View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

        LayoutInflater inflater = LayoutInflater.from(view.getContext());
        final View dialogView = inflater.inflate(R.layout.dialog, null);
        final EditText nameEdit = (EditText) dialogView.findViewById(R.id.editName);

        nameEdit.setText(pokeList.getmName());
        builder.setView(dialogView)
                .setTitle("Edit list name")
                .setPositiveButton("SAVE", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        String name = nameEdit.getText().toString();
                        if (name.length() > 0){
                            pokeList.setmName(name);
                            notifyDataSetChanged();
                        }
                        else {
<<<<<<< HEAD
                            Toast.makeText(dialogView.getRootView().getContext(), "Please Enter a Name", Toast.LENGTH_SHORT).show();
=======
                            Toast.makeText(dialogView.getRootView().getContext(), "Please Enter a Name", Toast.LENGTH_SHORT);
>>>>>>> 4756fc949a36319e8f9c1f6501f61f4de5b14edc
                        }
                    }
                })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .setNeutralButton("DELETE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        mPokeLists.remove(pokeList);
                        notifyDataSetChanged();
                    }
                });
        return builder.create();
    }

    public int getItemCount() {
        return mPokeLists.size();
    }


}
