package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by nikol on 17-Dec-17.
 */
public class Player {

    Album album;
    Playlist playlist;

    private ArrayList<Playlist> playlists = new ArrayList<>();
    private ArrayList<Album> albums = new ArrayList<>();

    public void addAlbum(String albumName){
        if(albumExists(albumName)){
            System.out.println("Album already exists.");
        } else {
            albums.add(new Album(albumName));
            System.out.println("Album "+albumName+" added.");
        }
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public void showAllAlbums(){
        Album album;
        for(int i=0; i<albums.size(); i++){
            album = albums.get(i);
            System.out.println("Album #"+(i+1)+"\n Name: "+album.getName());
        }
    }

    public void showAlbum(String albumName){
        Album album = getAlbum(albumName);
        Album.SongList songsList = album.getSongList();
        ArrayList<Song> songs = songsList.getSongs();
        for(int i=0; i<songs.size(); i++){
            Song song = songs.get(i);
            System.out.println("Song #"+(i+1)+"\n Name: "+song.getName()+"\n Duration: "+song.getDuration());
        }
    }

    private Album getAlbum(String albumName){
        for (int i=0; i<albums.size(); i++){
            album = albums.get(i);
            if(album.getName() == albumName){
                return album;
            }
        }
        return null;
    }

    private boolean albumExists(String albumName){
        for (int i=0; i<albums.size(); i++){
            album = albums.get(i);
            if(album.getName() == albumName){
                return true;
            }
        }
        return false;
    }

    public void addPlaylist(String playlistName){
        if(playlistExists(playlistName)){
            System.out.println("Playlist already exists.");
        } else {
            playlists.add(new Playlist(playlistName));
            System.out.println("Playlist "+playlistName+" added.");
        }
    }

    public void showAllPlaylists(){
        Playlist playlist;
        for(int i=0; i<playlists.size(); i++){
            playlist = playlists.get(i);
            System.out.println("Playlist #"+(i+1)+" : "+playlist.getPlaylistName());
        }
    }

    public void showPlaylist(String playlistName){
        Playlist playlist = getPlaylist(playlistName);
        LinkedList<Song> songPlaylist = playlist.getPlaylist();
        int songNumber = 0;
        Iterator<Song> iterator = songPlaylist.iterator();
        while(iterator.hasNext()){
            songNumber++;
            Song song = iterator.next();
            System.out.println("Song #"+songNumber+"\n Title: "+song.getName()+"\n Duration: "+song.getDuration());
        }
        setPlaylist(playlist);

    }

    private Playlist getPlaylist(String playlistName){
        if(playlistExists(playlistName)){
            for (int i=0; i<playlists.size(); i++){
                Playlist playlist = playlists.get(i);
                if(playlist.getPlaylistName()== playlistName){
                    return playlist;
                }
            }
        }
        return null;
    }

    private boolean playlistExists(String playlistName){
        for (int i=0; i<playlists.size(); i++){
            Playlist playlist = playlists.get(i);
            if(playlist.getPlaylistName()== playlistName){
                return true;
            }
        }
        System.out.println("No such playlists.");
        return false;
    }

    public void addSongToAlbum(String albumName, String songName, double duration){
        if(albumExists(albumName)){
            album = getAlbum(albumName);
            album.addSong(songName, duration);
        } else {
            System.out.println("Can't find the desired album. Try again.");
        }
    }

    public void addSongToPlaylist(String playlistName, String albumName, String songName){
        if(playlistExists(playlistName)){
            Playlist playlist = getPlaylist(playlistName);
            Album album = getAlbum(albumName);
            if (album != null){
                playlist.addSong(album.findSong(songName));
                setPlaylist(playlist);
            } else {
                System.out.println("Can't find the desired album. Try again.");
            }
        }
    }

    public int play(String playlistName, int position){
        LinkedList<Song> playlist = getPlaylist(playlistName).getPlaylist();
        Song song = playlist.get(position);
        System.out.println(song.getName()+" now playing...");
        position = playlist.indexOf(song);
        return position;
    }

    //TODO smesti u switch petlju
    public int skipForward(String playlistName, int position){

        Playlist playlist = getPlaylist(playlistName);
        LinkedList<Song> songPlaylist = playlist.getPlaylist();
        ListIterator<Song> iterator = songPlaylist.listIterator();
        int newPosition = 0;
        while(iterator.hasNext()){
            Song song = iterator.next();
            if(songPlaylist.indexOf(song) == position){
                Song forwardSong = iterator.next();
                newPosition = songPlaylist.indexOf(forwardSong);

                System.out.println("Skipped forward to song: " +forwardSong.getName());
            }
        }
        return newPosition;
    }

    public int skipBackward(String playlistName, int position){

        Playlist playlist = getPlaylist(playlistName);
        LinkedList<Song> songPlaylist = playlist.getPlaylist();
        ListIterator<Song> iterator = songPlaylist.listIterator();
        int newPosition = position-1;
        while(iterator.hasNext()){
            Song song = iterator.next();
            if(songPlaylist.indexOf(song) == newPosition){
//                Song previousSong = iterator.previous();
                System.out.println("Skipped backward to song: " +song.getName());
            }
        }
        return newPosition;
    }

    public int replaySong(String playlistName, int position){

        Playlist playlist = getPlaylist(playlistName);
        LinkedList<Song> songPlaylist = playlist.getPlaylist();
        ListIterator<Song> iterator = songPlaylist.listIterator();
        while(iterator.hasNext()){
            Song song = iterator.next();
            if(songPlaylist.indexOf(song) == position){
                System.out.println("Replaying song: " +song.getName());
            }
        }
        return position;
    }



}
