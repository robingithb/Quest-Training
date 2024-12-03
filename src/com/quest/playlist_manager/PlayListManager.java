package com.quest.playlist_manager;

import java.util.Map;

public class PlayListManager implements PlayListOperations{
    //create a playlist
    @Override
    public void createPlayList(String playListName, User user) throws DuplicateTrackException {
        PlayList playList1 =new PlayList(playListName);
        if(user.getUserPlayList().containsKey(playListName)){
            throw new DuplicateTrackException("this play list already here");
        }
        user.getUserPlayList().put(playListName,playList1);
    }
    //remove a playlist from user
    @Override
    public void removePlayList(String playListName, User user)  {
        if(!user.getUserPlayList().containsKey(playListName)){
            System.out.println("Not found the play list here...");
        }else user.getUserPlayList().remove(playListName);
    }

    //get a play list from user
    @Override
    public void getPlaylist(String name, User user)  {
        PlayList playList = user.getUserPlayList().get(name);
        if (playList == null){
            System.out.println("Not found the play list here...");
        }else {
            System.out.println(playList);
        }
    }
    //display all the playlists
    @Override
    public void displayAllPlaylist(User user) {
        for (Map.Entry<String,PlayList>entry : user.getUserPlayList().entrySet()){
            PlayList playList = entry.getValue();
            System.out.println(entry.getKey()+" "+playList.toString());
        }
    }
}
