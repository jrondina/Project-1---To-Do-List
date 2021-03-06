package com.example.jamesrondina.project_1_todolist;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

/**
 * Created by jamesrondina on 7/18/16.
 */
public class PokemonAdapter extends RecyclerView.Adapter<PokemonHolder> {

    List<Pokemon> mPokemons;


    public PokemonAdapter(List<Pokemon> pokemons) {
        this.mPokemons = pokemons;
    }

    @Override
    public PokemonHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.custom2, parent, false);

        PokemonHolder viewHolder = new PokemonHolder(parentView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PokemonHolder holder, int position) {
        final int pos = position;
        final Pokemon pokemon = mPokemons.get(pos);
        holder.mName.setText(pokemon.getmName());
        holder.mDesc.setText(pokemon.getmDesc());
        holder.mCheckBox.setChecked(pokemon.ismCaught());
        holder.mCheckBox.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    boolean checked = !pokemon.ismCaught();
                    CheckBox checkBox = (CheckBox) compoundButton;
                    checkBox.setChecked(checked);
                    pokemon.setmCaught(checked);
                }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                editListDetail(pokemon, view).show();
                return false;
            }
        });

    }

    private AlertDialog editListDetail(final Pokemon pokemon, View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());

        LayoutInflater inflater = LayoutInflater.from(view.getContext());
        final View dialogView = inflater.inflate(R.layout.dialog2, null);
        final EditText nameEdit = (EditText) dialogView.findViewById(R.id.editName);
        final EditText descEdit = (EditText) dialogView.findViewById(R.id.editDesc);

        nameEdit.setText(pokemon.getmName());
        descEdit.setText(pokemon.getmDesc());

        builder.setView(dialogView)
                .setTitle("Edit Pokemon name")
                .setPositiveButton("SAVE", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        String name = nameEdit.getText().toString();
                        String desc = descEdit.getText().toString();

                        if (name.length() > 0 && desc.length() > 0){
                            pokemon.setmName(name);
                            pokemon.setmDesc(desc);
                            notifyDataSetChanged();
                        }
                        else {
                            Toast.makeText(dialogView.getRootView().getContext(), "Please Enter something", Toast.LENGTH_SHORT).show();
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
                        mPokemons.remove(pokemon);
                        notifyDataSetChanged();
                    }
                });
        return builder.create();
    }

    @Override
    public int getItemCount() {
        return mPokemons.size();
    }

}
