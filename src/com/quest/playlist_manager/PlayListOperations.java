package com.quest.playlist_manager;

public interface PlayListOperations {
    void createPlayList(String playListName , User user);
    void removePlayList(String playListName , User user);
    void getPlaylist(String name , User user);
    void displayAllPlaylist(User user);
}
