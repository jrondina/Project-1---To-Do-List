package com.example.jamesrondina.project_1_todolist;

/**
 * Created by jamesrondina on 7/18/16.
 */
public class Pokemon {

    String mName;
    String mDesc;
    boolean mCaught;


    public Pokemon(String mName, String mDesc) {
        this.mName = mName;
        this.mDesc = mDesc;
        this.mCaught = false;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    public boolean ismCaught() {
        return mCaught;
    }

    public void setmCaught(boolean mCaught) {
        this.mCaught = mCaught;
    }
}
