//License Information
package com.music.validations;

import com.music.core.ArtistType;
import com.music.core.Genre;
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

        int current = Integer.parseInt(Year.now().toString());
        return year < current;
    }

    //validation for artist type
    public static boolean validateArtistType(int type) {

        //loop through all the enum constants
        for (ArtistType at : ArtistType.values()) {

            if (type == at.getSelection()) {//check the selected value
                return true;
            }
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
        }
        
        return false;
    }

    //validation for the song duration
    public static boolean validateDuration(int duration) {
        //validate the duration as positive.
        return duration > 0;
    }
}
