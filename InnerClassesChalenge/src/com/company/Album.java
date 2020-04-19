package com.company;

import java.util.ArrayList;

/**
 * Created by nikol on 17-Dec-17.
 */
public class Album {

    private String name;
    private SongList songList;


    public Album(String name) {
        this.name = name;
        this.songList = new SongList();
    }

    public String getName() {
        return name;
    }

    public SongList getSongList() {
        return songList;
    }


    public void addSong(String name, double duration){
        songList.addSong(name, duration);
    }

    public Song findSong(String songName){
        Song song = songList.findSong(songName);
        return song;
    }

    class SongList{

        Song song;

        private ArrayList<Song> songs = new ArrayList<>();

        public SongList() {
            this.songs = songs;
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public void addSong(String name, double duration){
            songs.add(new Song(name, duration));
            System.out.println("Song " +name+" added to the album.");
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

}
