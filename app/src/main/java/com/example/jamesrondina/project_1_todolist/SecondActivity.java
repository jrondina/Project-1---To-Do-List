package com.example.jamesrondina.project_1_todolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Created by jamesrondina on 7/8/16.
 */
public class SecondActivity extends AppCompatActivity {

    RecyclerView mRecyclerView2;
    List<SecondObject> secondObjects;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView2 = (RecyclerView) findViewById(R.id.recycler2);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView2.setLayoutManager(linearLayoutManager);



    }

    //TODO: show next list items

    //TODO:

}
