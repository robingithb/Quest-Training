package com.quest.playlist_manager;

public class Track  {

    private int trackId;
    private String trackTitle;
    private String trackArtist;
    private double trackDuration;
    //constructor
    public Track(int trackId, String trackTitle, String trackArtist, double trackDuration) {
        this.trackId = trackId;
        this.trackTitle = trackTitle;
        this.trackArtist = trackArtist;
        this.trackDuration = trackDuration;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackTitle() {
        return trackTitle;
    }

    public void setTrackTitle(String trackTitle) {
        this.trackTitle = trackTitle;
    }

    public String getTrackArtist() {
        return trackArtist;
    }

    public void setTrackArtist(String trackArtist) {
        this.trackArtist = trackArtist;
    }

    public double getTrackDuration() {
        return trackDuration;
    }

    public void setTrackDuration(double trackDuration) {
        this.trackDuration = trackDuration;
    }

    //display the tracks
    @Override
    public String toString() {
        return "Track{" +
                "trackId=" + trackId +
                ", trackTitle='" + trackTitle + '\'' +
                ", trackArtist='" + trackArtist + '\'' +
                ", trackDuration=" + trackDuration +
                '}';
    }

    @Override
    public int hashCode() {
        return trackId;
    }
    //checks the tracks
    @Override
    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Track track = (Track) obj; //down casting
        return trackId == track.trackId;
    }
}
