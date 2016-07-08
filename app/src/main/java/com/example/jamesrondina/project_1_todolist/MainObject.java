package com.example.jamesrondina.project_1_todolist;

/**
 * Created by jamesrondina on 7/8/16.
 */
public class MainObject {

    String ListName;

    public MainObject() {

        ListName = "List Name";
    }

    public MainObject(String ListName) {

        this.ListName = ListName;
    }

    public String getListName() {
        return ListName;
    }

    public void setListName(String ListName) {

        this.ListName = ListName;
    }
}
