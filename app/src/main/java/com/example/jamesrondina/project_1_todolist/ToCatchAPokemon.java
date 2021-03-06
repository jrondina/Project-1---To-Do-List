package com.example.jamesrondina.project_1_todolist;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class ToCatchAPokemon extends AppCompatActivity {

    RecyclerView mRecyclerView;
    PokeList mPokeList;
    PokemonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_catch_apokemon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);

        int index = getIntent().getIntExtra("listPosition", 0);
        mPokeList = PokeGroup.getGroup().mPokeList.get(index);

        adapter = new PokemonAdapter(mPokeList.getmPokeList());
        mRecyclerView.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setAlpha(0.35f);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog().show();
            }
        });
    }

    private AlertDialog dialog(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = ToCatchAPokemon.this.getLayoutInflater();
        final View v = inflater.inflate(R.layout.dialog2, null);
        final EditText editName = (EditText) v.findViewById(R.id.editName);
        final EditText editDesc = (EditText) v.findViewById(R.id.editDesc);
        builder.setView(v)
                .setTitle("Add a new Pokemon")
                .setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String pokeName = editName.getText().toString();
                        String pokeDesc = editDesc.getText().toString();
                        if (pokeName.length() == 0){
                            Toast.makeText(v.getContext(), "Please Enter a Name",
                                    Toast.LENGTH_SHORT).show();
                            editName.setError("Enter a Name");
                        }
                        else {
                            Pokemon pokemon = new Pokemon(pokeName, pokeDesc);
                            addPokemon(pokemon);
                            adapter.notifyDataSetChanged();
                        }
                    }
                })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        return builder.create();
    }
    private void addPokemon(Pokemon pokemon){
        mPokeList.getmPokeList().add(pokemon);
    }

}
