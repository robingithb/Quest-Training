package com.quest.playlist_manager;

import com.quest.practice_variables.Palindrome;

import java.util.List;
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
        System.out.println("the track is not added");
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
            for (Track track : playList.getListTracks()){
                if(!duplicate.add(track.getTrackTitle())){
                    System.out.println(track.getTrackTitle()+ " is duplicate");
                }
        }
    }

    @Override
    public void sortTracks(String choice , List<Track>allTracks) {
        if (choice.equalsIgnoreCase("title")){
          allTracks.sort(new SortByTitleComparator());
        }else if(choice.equalsIgnoreCase("duration")){
            allTracks.sort(new SortByDurationComparator());
        }
    }
}
