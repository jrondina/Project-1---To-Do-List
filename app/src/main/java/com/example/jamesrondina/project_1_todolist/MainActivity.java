package com.example.jamesrondina.project_1_todolist;

import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerview;
    List<MainObject> mainObjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerview = (RecyclerView) findViewById(R.id.recycler);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerview.setLayoutManager(linearLayoutManager);

        mainObjects = generateObjects();

        mRecyclerview.setAdapter(new MainAdapter(mainObjects));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext(), R.style.Alert);

                builder.setTitle(R.string.dialog_title);

                EditText editText = new EditText(MainActivity.this);
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                lp.setMargins(20,10,10,20);
                editText.setLayoutParams(lp);
                builder.setView(editText);
                final String newItem = editText.getText().toString();

                builder.setPositiveButton(R.string.positive, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                builder.setNegativeButton(R.string.negative, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        //cancel
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();


            }
        });


    }

    private List<MainObject> generateObjects() {
        List<MainObject> mainObjects = new ArrayList<>();

        mainObjects.add(new MainObject("Leaf Pokemon"));
        mainObjects.add(new MainObject("Fire Pokemon"));
        mainObjects.add(new MainObject("Water Pokemon"));

        return mainObjects;
    }

}


