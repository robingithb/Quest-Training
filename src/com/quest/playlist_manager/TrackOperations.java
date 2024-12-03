package com.quest.playlist_manager;

import java.util.List;

public interface TrackOperations {
    void addTrackToPlayList(int trackId , PlayList playList);
    void removeTrackFromPlayList(int trackId , PlayList playList);
    void searchTrackFromPlayList(String trackName , PlayList playList);
    void displayAllTracksFromPlayList(PlayList playList);
    void findDuplicateFromTrack(PlayList playList);
    void sortTracks(String choice , List<Track> allTracks);
//    void shuffleTracks(Track track);
}
