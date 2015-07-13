/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlistdemo;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author sburton
 */
public class SongIterator implements Iterator {

    private List<Song> theList;
    private int currentIndex;
    
    public SongIterator(List<Song> songs) {
        theList = songs;
        currentIndex = 0;
    }
    
    @Override
    public boolean hasNext() {
//        if (currentIndex < theList.size()) {
//            return true;
//        } else {
//            return false;
//        }
        
        return currentIndex < theList.size();
    }

    @Override
    public Object next() {
        return theList.get(currentIndex++);
    }
    
}
