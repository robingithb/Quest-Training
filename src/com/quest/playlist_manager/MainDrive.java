package com.quest.playlist_manager;

import java.util.Scanner;

public class MainDrive {
    public static void main(String[] args) {
        CentralManagement centralManagement = new CentralManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Central Management System =====");
            System.out.println("1. Add User");
            System.out.println("2. Remove User");
            System.out.println("3. Add tracks");
            System.out.println("4. Create Playlist");
            System.out.println("5. Remove Playlist");
            System.out.println("6. add track to Playlist");
            System.out.println("7. Remove track from Playlist");
            System.out.println("8.Find duplicates");
            System.out.println("9. Search track in playlist");
            System.out.println("10. Sorting the tracks from playlist");
            System.out.println("11.Merging the playlist");
            System.out.println("12. Shuffle the playlist");
            System.out.println("13. get playList of user");
            System.out.println("14. Display All Tracks ");
            System.out.println("15. Display All Playlists");
            System.out.println("16. Display All tracks from Playlists");
            System.out.println("17. Exit");
            System.out.print("Enter your choice: ");

            int choice =intTypeCheck(scanner);
            scanner.nextLine(); // Consume newline character

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter username: ");
                        String userName = stringTypeCheck(scanner);
                        try {
                            centralManagement.addUser(userName);
                            System.out.println("User added successfully.");
                        }catch (DuplicateTrackException d){
                            d.printStackTrace();
                        }
                        break;
                    case 2:
                        System.out.print("Enter username: ");
                        userName = stringTypeCheck(scanner);
                        centralManagement.removeUser(userName);
                        break;
                    case 3 :
                        System.out.print("Enter track ID: ");
                        int trackId = intTypeCheck(scanner);
                        System.out.print("Enter track title: ");
                        String trackTitle =stringTypeCheck(scanner);
                        System.out.print("Enter track artist: ");
                        String trackArtist = stringTypeCheck(scanner);
                        System.out.print("Enter track duration: ");
                        double duration =doubleTypeCheck(scanner);
                        scanner.nextLine(); // Consume newline
                        try {
                            centralManagement.addTrack(trackId, trackTitle, trackArtist, duration, null, null);
                            System.out.println("Track added to library successfully.");
                        }catch (DuplicateTrackException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        System.out.print("Enter username: ");
                        userName = stringTypeCheck(scanner);
                        System.out.print("Enter playlist name: ");
                        String playlistName = stringTypeCheck(scanner);
                        try {
                            centralManagement.createPlayList(playlistName, userName);
                            System.out.println("Playlist created successfully.");
                        }catch (DuplicateTrackException e){
                            e.printStackTrace();
                        }
                        break;
                    case 5:
                        System.out.print("Enter username: ");
                        userName =stringTypeCheck(scanner);
                        System.out.print("Enter playlist name: ");
                        playlistName = stringTypeCheck(scanner);
                        centralManagement.removePLayList(playlistName, userName);
                        break;
                    case 6:
                        System.out.print("Enter username: ");
                        userName = stringTypeCheck(scanner);
                        System.out.print("Enter playlist name: ");
                        playlistName = stringTypeCheck(scanner);
                        System.out.print("Enter track ID: ");
                        trackId = intTypeCheck(scanner);
                        scanner.nextLine(); // Consume newline
                        try {
                            centralManagement.addTrackToPlayList(trackId, playlistName, userName);
                            System.out.println("Track added to playlist successfully.");
                        }catch (DuplicateTrackException d){
                            d.printStackTrace();
                        }
                        break;
                    case 7:
                        System.out.print("Enter username: ");
                        userName = stringTypeCheck(scanner);
                        System.out.print("Enter playlist name: ");
                        playlistName = stringTypeCheck(scanner);
                        System.out.print("Enter track ID: ");
                        trackId = intTypeCheck(scanner);
                        scanner.nextLine(); // Consume newline
                        centralManagement.removeTrackFromPlaylist(trackId, playlistName, userName);
                        break;
                    case 8:
                        System.out.print("Enter username: ");
                        userName = stringTypeCheck(scanner);
                        System.out.print("Enter playlist name: ");
                        playlistName = stringTypeCheck(scanner);
                        centralManagement.FindDuplicates(userName, playlistName);
                        break;
                    case 9:
                        System.out.print("Enter username: ");
                        userName =stringTypeCheck(scanner);
                        System.out.print("Enter playlist name: ");
                        playlistName = stringTypeCheck(scanner);
                        System.out.print("Enter track name: ");
                        String trackName = stringTypeCheck(scanner);
                        centralManagement.searchTrackFromPlayList(trackName, userName, playlistName);
                        break;
                    case 10:
                        System.out.println("Enter choice duration / title");
                        String ch = stringTypeCheck(scanner);
                        System.out.print("Enter username: ");
                        userName =stringTypeCheck(scanner);
                        System.out.print("Enter playlist name: ");
                        playlistName = stringTypeCheck(scanner);
                        centralManagement.sortingThePlayList(ch,playlistName,userName);
                        break;
                    case 11:
                        System.out.print("Enter username: ");
                        userName =stringTypeCheck(scanner);
                        System.out.print("Enter playlist name: ");
                        String playlist1 = stringTypeCheck(scanner);
                        System.out.print("Enter playlist name: ");
                        String playlist2 = stringTypeCheck(scanner);
                        try{
                            centralManagement.mergePlayList(userName,playlist1,playlist2);
                            System.out.println("merged....!!!");
                        }catch (DuplicateTrackException d){
                            d.printStackTrace();
                        }
                        break;
                    case 12:
                        System.out.print("Enter username: ");
                        userName =stringTypeCheck(scanner);
                        System.out.print("Enter playlist name: ");
                        playlistName = stringTypeCheck(scanner);
                        centralManagement.shuffleTracksInThePlayList(playlistName,userName);
                        break;
                    case 13:
                        System.out.print("Enter username: ");
                        userName =stringTypeCheck(scanner);
                        System.out.print("Enter playlist name: ");
                        playlistName = stringTypeCheck(scanner);
                        centralManagement.getPLayListFromUser(playlistName,userName);
                        break;
                    case 14:
                        centralManagement.displayAllTracks();
                        break;
                    case 15:
                        System.out.print("Enter username: ");
                        userName =stringTypeCheck(scanner);
                        centralManagement.displayAllPlayList(userName);
                        break;
                    case 16:
                        System.out.print("Enter username: ");
                        userName =stringTypeCheck(scanner);
                        System.out.print("Enter playlist name: ");
                        playlistName = stringTypeCheck(scanner);
                        centralManagement.displayAllTracksInPlayList(userName,playlistName);
                        break;
                    case 17:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    //to check integer values
    private static int intTypeCheck(Scanner sc) {
        int value; //store  temporary
        while (!sc.hasNextInt()) {
            System.out.println("Enter valid Integer NUmber");
            sc.next();
        }
        value = sc.nextInt();
        return value; //it returns the integer value
    }

    //to check string values
    private static String stringTypeCheck(Scanner sc) {
        String str;
        while (true) {
//            System.out.println("Enter a valid String (letters and spaces only): ");
            str = sc.nextLine();
            // Check if the input is nonempty and only contains letters and spaces
            if (str.matches("[a-zA-Z\\s]+") && !str.trim().isEmpty()) {
                break; // Valid input, exit the loop
            } else {
                System.out.println("Invalid input. Please enter a valid name (letters and spaces only).");
            }
        }
        return str;
    }

    //to check double values
    private static double doubleTypeCheck(Scanner sc) {
        double value; //store  temporary
        while (!sc.hasNextDouble()) {
            System.out.println("Enter valid double");
            sc.next();
        }
        value = sc.nextDouble();
        return value; //it returns the boolean value
    }
}
