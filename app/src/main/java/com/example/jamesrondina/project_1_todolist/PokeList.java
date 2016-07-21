package com.example.jamesrondina.project_1_todolist;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jamesrondina on 7/18/16.
 */
public class PokeList {
    private String mName;
    List<Pokemon> mPokeList;

    public PokeList(String mName) {
        this.mName = mName;
        this.mPokeList = new LinkedList<>();
    }

    public PokeList(String mName, List<Pokemon> mPokeList) {
        this.mName = mName;
        this.mPokeList = mPokeList;
    }

    public String getmName() {

        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public List<Pokemon> getmPokeList() {
        return mPokeList;
    }

    public void setmPokeList(List<Pokemon> mPokeList) {
        this.mPokeList = mPokeList;
    }


    public void newPokemon(Pokemon pokemon){
        mPokeList.add(pokemon);
    }

    public void removePokemon(int position){
        if(!mPokeList.isEmpty())
            mPokeList.remove(position);
    }
}
