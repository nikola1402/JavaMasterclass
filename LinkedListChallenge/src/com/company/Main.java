package com.company;

public class Main {

    public static void main(String[] args) {


        Player player = new Player();

        player.addAlbum("First album");
        player.addSongToAlbum("First album", "Song 1", 3.11);
        player.addSongToAlbum("First album", "Song 2", 4.11);
        player.addSongToAlbum("First album", "Song 3", 5.11);
        player.addSongToAlbum("First album", "Song 4", 6.11);
        player.showAllAlbums();
        player.showAlbum("First album");

        player.addAlbum("Second album");
        player.addSongToAlbum("Second album", "Song 5", 5.22);
        player.addSongToAlbum("Second album", "Song 6", 6.22);
        player.showAllAlbums();
        player.showAlbum("Second album");

        player.addPlaylist("Playlist 1");
        player.addSongToPlaylist("Playlist 1", "First album", "Song 1");
        player.addSongToPlaylist("Playlist 1", "First album", "Song 2");
        player.addSongToPlaylist("Playlist 1", "First album", "Song 3");
        player.addSongToPlaylist("Playlist 1", "First album", "Song 4");
        player.addSongToPlaylist("Playlist 1", "Second album", "Song 5");
        player.addSongToPlaylist("Playlist 1", "Second album", "Song 6");
        player.showAllPlaylists();
        player.showPlaylist("Playlist 1");

        player.addPlaylist("Playlist 2");
        player.addSongToPlaylist("Playlist 2", "First album", "Song 1");
        player.addSongToPlaylist("Playlist 2", "Second album", "Song 6");
        player.showAllPlaylists();
        player.showPlaylist("Playlist 2");

        System.out.println("********************");
        int position = 0;
        position = player.play("Playlist 1", position);
        position = player.skipForward("Playlist 1", position);
        position = player.skipForward("Playlist 1", position);
        position = player.skipForward("Playlist 1", position);

        position = player.skipBackward("Playlist 1", position);
        position = player.skipBackward("Playlist 1", position);
        position = player.replaySong("Playlist 1", position);

        position = player.skipForward("Playlist 1", position);

        position = player.skipForward("Playlist 1", position);
        position = player.replaySong("Playlist 1", position);



    }
}
