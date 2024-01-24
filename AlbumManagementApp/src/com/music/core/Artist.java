//License Information

package com.music.core;

import com.music.validations.Validate;

/**
 *
 * @author LahiruCW
 */
public final class Artist {

    //declaration of variables
    private ArtistType type;
    private String name;
    private int yearOfBirth;

    public ArtistType getType() {
        return type;
    }

    public void setType(ArtistType type) {
        if(Validate.validateArtistType(type.getSelection())){
            this.type = type;
        }
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Validate.validateName(name)) { //validate the name before set
            this.name = name;
        }

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if(Validate.validateDate(yearOfBirth)){
            this.yearOfBirth = yearOfBirth;
        }
    }

    //methods
    public int getAge() {
        //implement code
        return 0;
    }

}
