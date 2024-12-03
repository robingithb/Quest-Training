package com.quest.playlist_manager;

import java.util.Map;

public class UserOperationsImpl implements UserOperations{
    //add user
    @Override
    public void addUser(String userName , Map<String,User> users ) throws DuplicateTrackException {
        if (users.containsKey(userName)){
            throw new DuplicateTrackException("user already here");
        }
        User user = new User(userName);
        users.put(userName,user);
    }
    //remove user
    @Override
    public void removeUser(String userName ,  Map<String,User> users) {
        if(!users.containsKey(userName)){
            System.out.println("user not removed");
        }
        users.remove(userName);
        System.out.println("user removed..."+userName);
    }

   /* @Override
    public void mergePlayList(String userName, String playList1, String playList2 , Map<String,User> users , TrackOperationImpl playListManager) {
        User user;
        PlayList newPlayList = new PlayList("new name");
        for( Map.Entry<String,User>entry : users.entrySet()){
            if(userName.equalsIgnoreCase(entry.getKey())){
                user = entry.getValue();
                PlayList playListA = user.userPlayList.get(playList1);
                PlayList playListB = user.userPlayList.get(playList2);
                for (Track track: playListA.listTracks){
                    try {
                        playListManager.addTrackToPlayList();
                        playListManager.createPlayList("newplaylist", user);
                    } catch (DuplicateTrackException e) {
                        throw new DuplicateTrackException("Duplicated tracks");
                    }
                }
                for (Track track: playListB.listTracks){
                    try {
                        newPlayList.addTrack(track);
                    } catch (DuplicateTrackException e) {
                        throw new DuplicateTrackException("Duplicated tracks");
                    }
                }
            }

        }
    }*/
}
