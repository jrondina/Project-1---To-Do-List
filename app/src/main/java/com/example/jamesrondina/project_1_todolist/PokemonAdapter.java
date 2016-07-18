package com.example.jamesrondina.project_1_todolist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

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
                    boolean checked = pokemon.ismCaught();
                    CheckBox checkBox = (CheckBox) compoundButton;
                    checkBox.setChecked(checked);
                    pokemon.setmCaught(checked);
                }
        });
        //TODO: onLongClickListener
    }

    @Override
    public int getItemCount() {
        return mPokemons.size();
    }

    //TODO: Dialog

}
