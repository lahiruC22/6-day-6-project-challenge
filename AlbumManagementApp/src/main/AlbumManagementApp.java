//License Information
package main;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author LahiruCW
 */
public class AlbumManagementApp implements AlbumList {
    
    // \resources\welcomemsg.txt

    //try to write file paths as relative paths not absolute paths.
    private static final String FILE_PATH = "resources\\welcomemsg.txt";

    //create a scanner object to read user input
    static Scanner read = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int choice; //store the user selection
        MenuOption option; //store the menu option

        Path path = Paths.get(FILE_PATH);

        //This line need to be deleted.
        System.out.println(System.getProperty("user.dir"));

        try {
            try (Scanner scanner = new Scanner(path)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
            }
        } catch (IOException ex) {
            //This logger should be changed to log the records in a file.
            Logger.getLogger(AlbumManagementApp.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("");
        do {
            //Display the menu options
            System.out.println("MUSICA 1.0 - MAIN MENU - ");
            System.out.println("1.Manage Albums");
            System.out.println("2.Manage Songs");
            System.out.println("3.Manage Artist");
            System.out.println("4.Exit");
            System.out.println("\nPlease choose an option:");

            //Read the user's choice
            choice = read.nextInt();

            //Get the enum constant from the choice
            option = MenuOption.fromValue(choice);

            //Use the switch statement to perform different actions based
            //on the option
            switch (option) {
                case MANAGE_ALBUMS -> {
                    //The logic code goes here
                    AlbumMenuOption albumOption; //store the album option

                    do {
                        System.out.println("---------------------------------------");
                        System.out.println("MUSICA 1.0 - MANAGE ALBUMS - ");
                        System.out.println("Number of Albums: " + albums.length);
                        System.out.println("---------------------------------------");
                        System.out.println("1.Create Album");
                        System.out.println("2.Delete Album");
                        System.out.println("3.Display Album List");
                        System.out.println("4.Display Song List");
                        System.out.println("5.Update Album");
                        System.out.println("6.Back");

                        System.out.println("\nPlease choose an option: ");

                        //read the user's choice
                        choice = read.nextInt();

                        //Get the enum constant from the choice
                        albumOption = AlbumMenuOption.fromValue(choice);

                        //Use the switch statement to perform different actions
                        //based on the option
                        switch (albumOption) {

                            case CREATE_ALBUM -> {
                                
                            }

                            case DELETE_ALBUM -> {

                            }

                            case DISPLAY_ALBUM_LIST -> {

                            }

                            case DISPLAY_SONG_LIST -> {

                            }

                            case UPDATE_ALBUM -> {

                            }
                        }
                    } while (albumOption != AlbumMenuOption.BACK);
                }

                case MANAGE_SONGS -> {
                    
                    //The logic code goes here
                    //The relevant tasks to be executed
                    
                    break;
                }

                case MANAGE_ARTISTS -> {
                    //The logic code goes here
                    
                    break;
                }
            }

        } while (option != MenuOption.EXIT); // Repeat until the user chooses to exit.

    }

}
