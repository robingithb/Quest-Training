package com.quest.playlist_manager;

public class DuplicateTrackException extends RuntimeException {
    public DuplicateTrackException(String message) {
        super(message);
    }
}
