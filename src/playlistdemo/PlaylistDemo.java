/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlistdemo;

import java.util.Iterator;

/**
 *
 * @author sburton
 */
public class PlaylistDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Playlist playlist = new Playlist();
        
        playlist.addSong(new Song("Journey", "Don't Stop Believin'"));
        playlist.addSong(new Song("The Beatles", "Paperback writer"));
        playlist.addSong(new Song("Rick Astley", "Never Gonna give you up"));
        
//        
//        Iterator<Song> it = playlist.iterator();
//        
//        while (it.hasNext()) {
//            Song song = it.next();
//            System.out.println(song.getTitle() + " by " + song.getArtist());
//        }
        
        for (Song song : playlist) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }
        
        
    }
    
}
