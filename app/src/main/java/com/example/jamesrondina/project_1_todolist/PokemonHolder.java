package com.example.jamesrondina.project_1_todolist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jamesrondina on 7/18/16.
 */
public class PokemonHolder extends RecyclerView.ViewHolder {

    ImageView mPokeball;
    TextView mName;
    TextView mDesc;
    CheckBox mCheckBox;

    public PokemonHolder(View itemView) {
        super(itemView);

        mPokeball = (ImageView) itemView.findViewById(R.id.pokeball2);
        mName = (TextView) itemView.findViewById(R.id.pokeNameText);
        mDesc = (TextView) itemView.findViewById(R.id.pokeDescText);
        mCheckBox = (CheckBox) itemView.findViewById(R.id.checkBox);
    }
}
