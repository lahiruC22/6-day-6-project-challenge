//License Information

package com.music.validations;

import com.music.core.ArtistType;
import com.music.core.Genre;
import com.music.core.Publisher;
import com.music.core.Song;

import java.time.Year; //import date time package

/**
 *
 * @author LahiruCW
 */
public final class Validate {

    //validation for the name fields
    //Only validation consider for the name, address in all the classes is same.
    public static boolean validateName(String name) {
        return name != null;
    }

    //validation for the date variables
    public static boolean validateDate(int year) {
        
        //year must be 4 digit value
        int current = Integer.parseInt(Year.now().toString());
        int length = String.valueOf(year).length(); //convert the year into the string object and get the length.
        return year < current && length == 4;
    }

    //validation for artist type
    public static boolean validateArtistType(int type) {

        //loop through all the enum constants
        //New Java Loop introduced in Java 8 and above name : For Each Loop.
        for (ArtistType at : ArtistType.values()) {

            if (type == at.getSelection()) {//check the selected value
                return true;
            }
            
            break; //stop the loop after found.
        }
        return false;
    }
    
    //validation for the music Genre
    public static boolean validateGenre(int genre){
        
        //loop through all the enum constants
        for(Genre at: Genre.values()){
            if(genre == at.getSelection()){
                return true;
            }
            break;
        }
        
        return false;
    }

    //validation for the song duration
    public static boolean validateDuration(int duration) {
        //validate the duration as positive.
        return duration > 0;
    }
    
    //validation for the singer artist type
    public static boolean validateSinger(int singerType){
        return singerType==2;
    }
    
    //validation for the writer artist type
    public static boolean validateWriter(int writerType){
        return writerType == 1;
    }
    
    //validation for the composer artist type
    public static boolean validateComposer(int composerType){
        return composerType == 3;
    }
    
    //validation for the song list
    public static boolean validateSongList(Song[] songList){
        return songList == null || songList.length != 0;
    }
    
    //validation for the publisher
    public static boolean validatePublisher(Publisher publisher){
        return publisher!=null;
    }
}
