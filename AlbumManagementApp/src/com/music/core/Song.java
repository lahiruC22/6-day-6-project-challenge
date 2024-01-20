//License Information

package com.music.core;

/**
 *
 * @author LahiruCW
 */
public final class Song {
    
    //declaration of variables
    private String title;
    private Genre genre;
    private Artist singer;
    private Artist writer;
    private Artist composer;
    private int durationInSecond;
    private int yearOfRelease;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Artist getSinger() {
        return singer;
    }

    public void setSinger(Artist singer) {
        this.singer = singer;
    }

    public Artist getWriter() {
        return writer;
    }

    public void setWriter(Artist writer) {
        this.writer = writer;
    }

    public Artist getComposer() {
        return composer;
    }

    public void setComposer(Artist composer) {
        this.composer = composer;
    }

    public int getDurationInSecond() {
        return durationInSecond;
    }

    public void setDurationInSecond(int durationInSecond) {
        this.durationInSecond = durationInSecond;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    
    //declaring methods
    public double getDurationInMinutes(){
        //implement the method in here.
        return 0.0;
    }
    
    public double getDurationInHour(){
        //implement the method in here.
        return 0.0;
    }
}
