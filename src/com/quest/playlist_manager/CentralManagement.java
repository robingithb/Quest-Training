package com.quest.playlist_manager;

import java.util.*;

public class CentralManagement {
    Map<String,User> users;
    List<Track>allTracks;
    TrackOperationImpl trackManager;
    PlayListManager playListManager;
    UserOperationsImpl userManager;


    public CentralManagement() {
        this.users = new TreeMap<>();
        this.allTracks = new ArrayList<>();
        trackManager = new TrackOperationImpl();
        playListManager = new PlayListManager();
        userManager = new UserOperationsImpl();
    }
 //here adding the track
    public void addTrack(int trackId,String trackTitle,String trackArtist,Double duration,String userName,String playListName){
        Track track = new Track(trackId,trackTitle,trackArtist,duration);
        if(allTracks.contains(track)){
            throw new DuplicateTrackException("track is already here");
        }
        allTracks.add(track);
    }
    //adding track to playlist
    public void addTrackToPlayList(int trackId , String pLayListName , String username)throws DuplicateTrackException {
        PlayList playList = null;
        for (Map.Entry<String, User> entry : users.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(username)) {
                playList = entry.getValue().getUserPlayList().get(pLayListName);
            }
        }
        if (playList != null) {
            trackManager.addTrackToPlayList(trackId, playList);
        }
    }
    //removing track from play list
    public void  removeTrackFromPlaylist( int trackId ,String pLayListName , String username){
        PlayList playList = null;
        for (Map.Entry<String, User> entry : users.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(username)) {
                playList = entry.getValue().getUserPlayList().get(pLayListName);
            }
        }
        if (playList != null) {
            trackManager.removeTrackFromPlayList(trackId,playList);
        }

    }
    //find the duplicates from the playlist
    public void FindDuplicates( String userName , String playListName){
        PlayList playList = null;
        for (Map.Entry<String, User> entry : users.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(userName)) {
                playList = entry.getValue().getUserPlayList().get(playListName);
            }
        }
        if (playList != null) {
            trackManager.findDuplicateFromTrack(playList);
        }
    }
    //search a track from playlist
    public void searchTrackFromPlayList(String trackName ,  String userName , String playListName) {
        PlayList playList = null;
        for (Map.Entry<String, User> entry : users.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(userName)) {
                playList = entry.getValue().getUserPlayList().get(playListName);
            }
        }
        if (playList != null) {
            trackManager.searchTrackFromPlayList(trackName, playList);
        }
    }
    //display all the tracks
        public void displayAllTracks (String userName, String playListName){
            PlayList playList = null;
            for (Map.Entry<String, User> entry : users.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(userName)) {
                    playList = entry.getValue().getUserPlayList().get(playListName);
                }
            }
            if (playList != null) {
                trackManager.displayAllTracksFromPlayList(playList);
            }
        }
        //create a playlist
         public void createPlayList(String playListName , String userName){
             for (Map.Entry<String, User> entry : users.entrySet()) {
                 if (entry.getKey().equalsIgnoreCase(userName)) {
                    playListManager.createPlayList(playListName , entry.getValue());
                 }
             }
         }
         //remove a playlist
         public void removePLayList(String playListName , String userName){
             for (Map.Entry<String, User> entry : users.entrySet()) {
                 if (entry.getKey().equalsIgnoreCase(userName)) {
                     playListManager.removePlayList(playListName , entry.getValue());
                 }
             }
         }
         //get a play list from the user
    public void getPLayListName(String playListName , String userName){
        for (Map.Entry<String, User> entry : users.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(userName)) {
                playListManager.getPlaylist(playListName , entry.getValue());
            }
        }
    }
    //display all the playlist
    public void displayAllPlayList(String userName){
        for (Map.Entry<String, User> entry : users.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(userName)) {
                playListManager.displayAllPlaylist(entry.getValue());
            }
        }
    }
    //adding the user
     public void addUser(String userName){
        userManager.addUser(userName,users);
     }
     //remove user
     public void removeUser(String userName){
        userManager.removeUser(userName,users);
     }



        //merging two play lists

//    public void mergePlayList(String userName , String playList1, String playList2) {
//        User user;
//        PlayList newPlayList = new PlayList("new name");
//       for( Map.Entry<String,User>entry : users.entrySet()){
//           if(userName.equalsIgnoreCase(entry.getKey())){
//               user = entry.getValue();
//               PlayList playListA = user.userPlayList.get(playList1);
//               PlayList playListB = user.userPlayList.get(playList2);
//               for (Track track: playListA.listTracks){
//                  try {
//                      newPlayList.addTrack(track);
//                  } catch (DuplicateTrackException e) {
//                      throw new DuplicateTrackException("Duplicated tracks");
//                  }
//               }
//               for (Track track: playListB.listTracks){
//                   try {
//                       newPlayList.addTrack(track);
//                   } catch (DuplicateTrackException e) {
//                       throw new DuplicateTrackException("Duplicated tracks");
//                   }
//               }
//           }
//
//       }
//
//    }
}
