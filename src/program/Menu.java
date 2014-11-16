package program;
import java.util.Scanner;


/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Hu
 *         Date: 11/15/14
 *         Description:
 */


public class Menu {

    /**
     * This method promts the user and returns an int.
     * @return
     */
    public int optionMenu() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("-- Actions --");
        System.out.println(
                "Select an option: \n"+
                        "  1) Enter a new person\n"+
                        "  2) Print the contact list\n"+
                        "  3) Retreive a persons information by last name \n"+
                        "  4) Retrieve a person's information by email address\n "+
                        " 5) Retrieve all people who live in a given zip code \n"+
                        "  0) Exit menu"
        );

        return keyboard.nextInt();
    }

}
