package com.example.jamesrondina.project_1_todolist;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

//declare objects/variables here
    RecyclerView mRecyclerview;
    PokeGroup pokeGroup;
    PokeListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        pokeGroup = PokeGroup.getGroup();

        //setting up recyclerview
        mRecyclerview = (RecyclerView) findViewById(R.id.recycler);

        LinearLayoutManager linearLayoutManager =
                    new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
<<<<<<< HEAD
        mRecyclerview.setLayoutManager(linearLayoutManager);

        adapter = new PokeListAdapter(pokeGroup.mPokeList);
        mRecyclerview.setAdapter(adapter);

=======

        adapter = new PokeListAdapter(pokeGroup.mPokeList);
        mRecyclerview.setLayoutManager(linearLayoutManager);

>>>>>>> 4756fc949a36319e8f9c1f6501f61f4de5b14edc


       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog().show();
            }
        });
    }


//I don't think I need this? It was auto generated when I made the file
/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

//Dialog Box Function
    private AlertDialog dialog(){
<<<<<<< HEAD

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        LayoutInflater inflater = MainActivity.this.getLayoutInflater();

=======

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        LayoutInflater inflater = MainActivity.this.getLayoutInflater();

>>>>>>> 4756fc949a36319e8f9c1f6501f61f4de5b14edc
        final View v = inflater.inflate(R.layout.dialog, null);
        final EditText editName = (EditText) v.findViewById(R.id.editName);

        editName.setHint("Enter name of list here");
        builder.setView(v)

                .setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String name = editName.getText().toString();
                        if(name.length() == 0){

                            Toast.makeText(v.getContext(), "Please Enter Some Text",
                                    Toast.LENGTH_SHORT).show();

                        }

                        else {

                            PokeList PokeList = new PokeList(name);
                            newPokeList(PokeList);
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


    private void newPokeList(PokeList list){
        pokeGroup.mPokeList.add(list);
    }
}

