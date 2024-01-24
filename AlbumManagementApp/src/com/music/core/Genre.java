//License Information

package com.music.core;

/**
 *
 * @author LahiruCW
 */

public enum Genre {
    
    CLASSIC(1),
    REGGAE(2),
    POP(3),
    JAZZ(4),
    COUNTRY(5),;
    
    private final int selection;

    private Genre(int selection) {
        this.selection = selection;
    }

    public int getSelection() {
        return selection;
    }  
}
