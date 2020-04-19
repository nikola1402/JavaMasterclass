package com.company;

import java.util.ArrayList;

/**
 * Created by nikol on 17-Dec-17.
 */
public class Album {

    Song song;
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public void addSong(String name, double duration){
        songs.add(new Song(name, duration));
        System.out.println("Song " +name+" added to the album " +this.name);
    }

    public Song findSong(String songName){
        for(int i=0; i<songs.size(); i++){
            song = songs.get(i);
            if(song.getName() == songName){
                return song;
            }
        }
        return null;
    }

}
