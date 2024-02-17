//License Information

package main;

/**
 *
 * @author LahiruCW
 */
public enum AlbumMenuOption {
    CREATE_ALBUM(1),
    DELETE_ALBUM(2),
    DISPLAY_ALBUM_LIST(3),
    DISPLAY_SONG_LIST(4),
    UPDATE_ALBUM(5),
    BACK(6);
    
    private int value;

    private AlbumMenuOption(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public static AlbumMenuOption fromValue(int value){
        for(AlbumMenuOption option: AlbumMenuOption.values()){
            if(option.getValue()==value){
                return option;
            }
        }
        
        return null;
    }
}
