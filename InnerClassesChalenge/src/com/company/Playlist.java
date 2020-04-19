package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by nikol on 17-Dec-17.
 */
public class Playlist {

    Album album;
    Song song;
    private String playlistName;
    private LinkedList<Song> playlist = new LinkedList<>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getPlaylistName() {
        return playlistName;
    }


    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void addSong(Song song){
        this.playlist.add(song);
        System.out.println("Song "+song.getName()+" added to the playlist "+getPlaylistName());
    }

    public boolean songExists(Song song){
        if(playlist.contains(song)){
            return true;
        }
        return false;
    }

    public Song getSong(Song song){
        if(!songExists(song)){
            Iterator<Song> iterator = playlist.iterator();
            while(iterator.hasNext()){
                Song songFound = iterator.next();
                if(songFound == song) {
                    return song;
                }
            }
        }
        System.out.println("Song doesn't exist in playlist.");
        return null;
    }


}
