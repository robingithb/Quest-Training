package com.quest.playlist_manager;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayListManager implements PlayListOperations {
    //create a playlist
    @Override
    public void createPlayList(String playListName, User user) throws DuplicateTrackException {
        PlayList playList1 = new PlayList(playListName);
        if (user.getUserPlayList().containsKey(playListName)) {
            throw new DuplicateTrackException("this play list already here");
        }
        user.getUserPlayList().put(playListName, playList1);
    }

    //remove a playlist from user
    @Override
    public void removePlayList(String playListName, User user) {
        if (!user.getUserPlayList().containsKey(playListName)) {
            System.out.println("Not found the play list here...");
        } else {
            user.getUserPlayList().remove(playListName);
            System.out.println("play list removed" + playListName);
        }
    }

    //get a play list from user
    @Override
    public void getPlaylist(String name, User user) {
        PlayList playList = user.getUserPlayList().get(name);
        if (playList == null) {
            System.out.println("Not found the play list here...");
        } else {
            System.out.println(playList);
        }
    }

    //display all the playlists
    @Override
    public void displayAllPlaylist(User user) {
        for (Map.Entry<String, PlayList> entry : user.getUserPlayList().entrySet()) {
            PlayList playList = entry.getValue();
            System.out.println(entry.getKey() + " ");
            playList.displayPlaylist();
        }
    }

    @Override
    public void sortTracks(String choice, List<Track> listTrack) {
        if (choice.equalsIgnoreCase("title")) {
            listTrack.sort(new SortByTitleComparator());
            System.out.println("sorted using title");
        } else if (choice.equalsIgnoreCase("duration")) {
            listTrack.sort(new SortByDurationComparator());
            System.out.println("sorted using duration");
        } else {
            System.out.println("Oops!! not sorted");
        }
    }

    @Override
    public void shufflePlayList(List<Track> playListTracks) {
        Collections.shuffle(playListTracks);
        System.out.println("shuffled playlist");
    }
}
