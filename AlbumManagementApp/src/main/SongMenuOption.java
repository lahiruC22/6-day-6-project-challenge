//License Information

package main;

/**
 *
 * @author LahiruCW
 */
public enum SongMenuOption {
    
    CREATE_SONG(1),
    DELETE_SONG(2),
    DISPLAY_SONG_LIST(3),
    UPDATE_ALBUM(4),
    BACK(5);
    
    private int value;

    private SongMenuOption(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public static SongMenuOption fromValue(int value){
        for(SongMenuOption option: SongMenuOption.values()){
            if(option.getValue()==value){
                return option;
            }
        }
        
        return null;
    }
}
