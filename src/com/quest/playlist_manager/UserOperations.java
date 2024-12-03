package com.quest.playlist_manager;

import java.util.Map;

public interface UserOperations {
    void addUser(String userName , Map<String,User> users );
    void removeUser(String userName , Map<String,User> users);
//    void mergePlayList(String userName,String playList1 , String playList2 , Map<String,User> users);

}
