//License Informations

package com.music.core;

/**
 *
 * @author LahiruCW
 */
public enum ArtistType {
    
    WRITER(1),
    SINGER(2),
    COMPOSER(3),;
    
    private final int selection;

    private ArtistType(int selection) {
        this.selection = selection;
    }

    public int getSelection() {
        return this.selection;
    }
}
