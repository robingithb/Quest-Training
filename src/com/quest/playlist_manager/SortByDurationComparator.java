package com.quest.playlist_manager;

import java.util.Comparator;

public class SortByDurationComparator implements Comparator<Track> {
    @Override
    public int compare(Track o1, Track o2) {
        //ascending order
        if (o1.getTrackDuration() > o2.getTrackDuration()){
            return 1;
        }else if (o1.getTrackDuration() < o2.getTrackDuration()){
            return -1;
        }else return 0 ; //equal duration;
    }
}
