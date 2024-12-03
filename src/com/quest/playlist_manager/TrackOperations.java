package com.quest.playlist_manager;

public interface TrackOperations {
    void addTrackToPlayList(int trackId , PlayList playList);
    void removeTrackFromPlayList(int trackId , PlayList playList);
    void searchTrackFromPlayList(String trackName , PlayList playList);
    void displayAllTracksFromPlayList(PlayList playList);
    void findDuplicateFromTrack(PlayList playList);
   // void sortTracks(Track track);
//    void shuffleTracks(Track track);
}
