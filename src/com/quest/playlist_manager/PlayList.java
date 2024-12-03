package com.quest.playlist_manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
//constructor
public class PlayList {
    private String playListName;
    ArrayList<Track>listTracks;

    public PlayList(String playListName) {
        this.playListName = playListName;
        listTracks = new ArrayList<>();
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public ArrayList<Track> getListTracks() {
        return listTracks;
    }

    public void setListTracks(ArrayList<Track> listTracks) {
        this.listTracks = listTracks;
    }


    @Override
    public String toString() {
        return "PlayList{" +
                "playListName='" + playListName + '\'' +
                ", listTracks=" + listTracks +
                '}';
    }
}
