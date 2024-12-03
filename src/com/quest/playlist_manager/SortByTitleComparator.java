package com.quest.playlist_manager;

import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;

public class SortByTitleComparator implements Comparator<Track> {
    @Override
    public int compare(Track o1, Track o2) {
        //using title to compare
        return o1.getTrackTitle().compareToIgnoreCase(o2.getTrackTitle());
    }
}
