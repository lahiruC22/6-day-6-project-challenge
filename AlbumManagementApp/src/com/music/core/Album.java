//License Information

package com.music.core;

import com.music.validations.Validate;

/**
 *
 * @author LahiruCW
 */
public final class Album {
    
    //declare variables
    private String albumName;
    private int yearOfRelease;
    private Song[] listOfSongs;
    private Publisher publisher;

    public Album(String albumName, Publisher publisher) {
        this.albumName = albumName;
        this.publisher = publisher;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        if(Validate.validateName(albumName)){
            this.albumName = albumName;
        }
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        if(Validate.validateDate(yearOfRelease)){
            this.yearOfRelease = yearOfRelease;
        }
    }

    public Song[] getListOfSongs() {
        return listOfSongs;
    }

    public void setListOfSongs(Song[] listOfSongs) {
        if(Validate.validateSongList(listOfSongs)){
            this.listOfSongs = listOfSongs;
        }
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        if(Validate.validatePublisher(publisher)){
            this.publisher = publisher;
        }
    }
    
    //declaring methods
    public Song getSongByTitle(String title){
        for(Song item: this.listOfSongs){
            if(item.getTitle().equals(title)){
                return item;
            }
        }
        return null;
    }
    
    //overide method
    public Song[] getSongsByArtist(String name){
        
        int index = 0;
        Song[] songsByArtist = new Song[10]; //local array for return
        
        for(Song item: this.listOfSongs){
            //assumption - consider only the singer artist
            if(item.getWriter().getName().equals(name) || 
                    item.getSinger().getName().equals(name) ||
                    item.getComposer().getName().equals(name)){
                songsByArtist[index] = item;
                index++;
            }
        }
        
        return songsByArtist;

    }
    
    public Song[] getSongByYear(int year){
        int index = 0;
        Song[] yearList = new Song[10];
        
        for(Song item:this.listOfSongs){
            if(item.getYearOfRelease() == year){
                yearList[index] = item;
                index++;
            }
        }
        return yearList;
    }
}
