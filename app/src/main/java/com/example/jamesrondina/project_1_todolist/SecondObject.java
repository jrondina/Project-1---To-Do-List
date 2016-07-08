package com.example.jamesrondina.project_1_todolist;

/**
 * Created by jamesrondina on 7/8/16.
 */
public class SecondObject {

    String ListName;
    String description;

    public SecondObject() {

        ListName = "List Name";
        description = "Description";
    }

    public SecondObject(String ListName) {

        this.ListName = ListName;
    }

    public String getListName() {
        return ListName;
    }

    public void setListName(String listName) {
        ListName = listName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
