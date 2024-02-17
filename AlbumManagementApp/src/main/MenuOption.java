//License Infromation

package main;

/**
 *
 * @author LahiruCW
 */
public enum MenuOption {
    
    MANAGE_ALBUMS(1),
    MANAGE_SONGS(2),
    MANAGE_ARTISTS(3),
    EXIT(4);
    
    private int value;

    private MenuOption(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public static MenuOption fromValue(int value){
        for(MenuOption option: MenuOption.values()){
            if(option.getValue()==value){
                return option;
            }
        }
        
        return null;
    }
}
