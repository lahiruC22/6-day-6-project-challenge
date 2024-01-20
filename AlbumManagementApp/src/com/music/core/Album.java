//License Information

package com.music.core;

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

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Song[] getListOfSongs() {
        return listOfSongs;
    }

    public void setListOfSongs(Song[] listOfSongs) {
        this.listOfSongs = listOfSongs;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    
    //declaring methods
    public Song getSongByTitle(String title){
        //return song object //must be implemented
        Song request = null;
        return request;
    }
    
    public Song[] getSongByArtist(String name){
        //return song array object. //must be implemented
        Song[] artist = new Song[5];
        return artist;
    }
    
    public Song[] getSongByYear(int year){
        //return song array object //must be implemented
        Song[] yearList = new Song[5];
        return yearList;
    }
}
