/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlistdemo;

/**
 *
 * @author sburton
 */
public class Song {
    private String artist;
    private String title;

    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }    

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
}
