package com.quest.playlist_manager;

import java.util.List;

public interface PlayListOperations {
    void createPlayList(String playListName , User user) throws DuplicateTrackException;
    void removePlayList(String playListName , User user) ;
    void getPlaylist(String name , User user) ;
    void displayAllPlaylist(User user);
    void sortTracks(String choice , List<Track> playlistTracks);
    void shufflePlayList(List<Track>playListTracks);

}
