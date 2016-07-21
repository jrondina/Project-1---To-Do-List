package com.example.jamesrondina.project_1_todolist;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jamesrondina on 7/18/16.
 */
public class PokeGroup {

    List<PokeList> mPokeList;

    static PokeGroup pokeGroup = new PokeGroup();

    public static PokeGroup getGroup() {
        return pokeGroup;
    }

    private PokeGroup() {
        mPokeList = new LinkedList<>();
<<<<<<< HEAD


    }
    
    public List<Pokemon> getPokemon(int i){
=======
    }
    
    public List<Pokemon> newPokemon(int i){
>>>>>>> 4756fc949a36319e8f9c1f6501f61f4de5b14edc
        return mPokeList.get(i).getmPokeList();
    }

}
