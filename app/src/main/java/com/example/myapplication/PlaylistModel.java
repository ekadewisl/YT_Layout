package com.example.myapplication;

public class PlaylistModel {

    public String playlist;
    public int imgPlaylist;

    public PlaylistModel(String playlist, int imgPlaylist) {
        this.playlist = playlist;
        this.imgPlaylist = imgPlaylist;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public int getImgPlaylist() {
        return imgPlaylist;
    }

    public void setImgPlaylist (int imgPlaylist) { this.imgPlaylist = imgPlaylist; }
}
