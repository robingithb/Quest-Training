package com.quest.playlist_manager;

import com.quest.oops.library.Book;
import com.quest.practice_variables.Palindrome;

import java.util.List;
import java.util.TreeSet;

public class TrackOperationImpl implements TrackOperations {
    //add tracks to the playlist
    @Override
    public void addTrackToPlayList(int trackId , PlayList playList) throws DuplicateTrackException {
        for (Track track : playList.getListTracks()){
            if (track.getTrackId() == trackId){
                playList.getListTracks().add(track);
                return;
            }
        }
        throw new DuplicateTrackException("Duplicate track");
    }
    //remove tracks from playlist
    @Override
    public void removeTrackFromPlayList(int trackId , PlayList playList) {
        for (Track track : playList.getListTracks()){
            if (track.getTrackId() == trackId){
                playList.getListTracks().remove(track);
                System.out.println("track removed from the playlist");
                return;
            }
        }
        System.out.println("the track is not removed");
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
        System.out.println("not found");

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
            boolean flag = false;
            for (Track track : playList.getListTracks()){
                if(!duplicate.add(track.getTrackTitle())){
                    System.out.println(track.getTrackTitle()+ " is duplicate");
                    flag = true;
                }
        }
            if(!flag){
                System.out.println("No duplicates");
            }
    }

}
