//License Information
package com.music.core;

import com.music.validations.Validate;

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
        if (Validate.validateName(title)) {
            this.title = title;
        }
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        if (Validate.validateGenre(genre.getSelection())) {
            this.genre = genre;
        }
    }

    public Artist getSinger() {
        return singer;
    }

    public void setSinger(Artist singer) {
        if (Validate.validateSinger(singer.getType().getSelection())) {
            this.singer = singer;
        }
    }

    public Artist getWriter() {
        return writer;
    }

    public void setWriter(Artist writer) {
        if (Validate.validateWriter(writer.getType().getSelection())) {
            this.writer = writer;
        }
    }

    public Artist getComposer() {
        return composer;
    }

    public void setComposer(Artist composer) {
        if (Validate.validateComposer(composer.getType().getSelection())) {
            this.composer = composer;
        }
    }

    public int getDurationInSecond() {
        return durationInSecond;
    }

    public void setDurationInSecond(int durationInSecond) {
        if (Validate.validateDuration(durationInSecond)) {
            this.durationInSecond = durationInSecond;
        }
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        if (Validate.validateDate(yearOfRelease)) {
            this.yearOfRelease = yearOfRelease;
        }
    }

    //declaring methods
    public double getDurationInMinutes() {
        return (double)(this.durationInSecond/60.0);
    }

    public double getDurationInHour() {
        return (double)(getDurationInMinutes()/60.0);
    }
}
