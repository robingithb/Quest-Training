package com.quest.playlist_manager;

import java.util.HashMap;
import java.util.Map;

public class User{
    private String userName;
    HashMap<String,PlayList>userPlayList;


    public User(String userName) {
        this.userName = userName;
        this.userPlayList = new HashMap<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public HashMap<String, PlayList> getUserPlayList() {
        return userPlayList;
    }

    public void setUserPlayList(HashMap<String, PlayList> userPlayList) {
        this.userPlayList = userPlayList;
    }
}
