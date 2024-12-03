package com.quest.playlist_manager;

import com.quest.practice_variables.Palindrome;

import java.util.TreeSet;

public class TrackOperationImpl implements TrackOperations {
    //add tracks to the playlist
    @Override
    public void addTrackToPlayList(int trackId , PlayList playList) {
        for (Track track : playList.getListTracks()){
            if (track.getTrackId() == trackId){
                playList.getListTracks().add(track);
                return;
            }
        }
        throw new UnKnownTrack("track not found");
    }
    //remove tracks from playlist
    @Override
    public void removeTrackFromPlayList(int trackId , PlayList playList) {
        for (Track track : playList.getListTracks()){
            if (track.getTrackId() == trackId){
                playList.getListTracks().remove(track);
                return;
            }
        }
        throw new UnKnownTrack("track not found");
    }
    //search track from playlist
    @Override
    public void searchTrackFromPlayList(String trackName , PlayList playList) {
        for (Track track : playList.getListTracks()){
            if(track.getTrackTitle().equalsIgnoreCase(trackName)){
                track.toString();
                return;
            }
        }
        throw  new UnKnownTrack("track not found");

    }
    //display all tracks from playlist
    @Override
    public void displayAllTracksFromPlayList(PlayList playList) {
        for (Track track : playList.getListTracks()){
            track.toString();
        }
    }
    //find any duplicate tracks
    @Override
    public void findDuplicateFromTrack(PlayList playList) {

            TreeSet<String> duplicate = new TreeSet<>();
            for (Track track : playList.getListTracks()){
                if(!duplicate.add(track.getTrackTitle())){
                    System.out.println(track.getTrackTitle()+ " is duplicate");
                }
        }
    }
}
