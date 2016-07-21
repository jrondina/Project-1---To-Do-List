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


    }
    
    public List<Pokemon> getPokemon(int i){
        return mPokeList.get(i).getmPokeList();
    }

}
