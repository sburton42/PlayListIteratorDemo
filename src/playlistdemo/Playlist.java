/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlistdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sburton
 */
public class Playlist implements Iterable<Song> {
    
    private List<Song> songs = new ArrayList<Song>();
    
    public void addSong(Song s) {
        songs.add(s);
    }

    @Override
    public Iterator<Song> iterator() {
        return new SongIterator(songs);
        // Could simply be:
        //return songs.iterator();
    }
    
}
