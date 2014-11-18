package program;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Hu
 * Date: 11/15/14
 * Description: This class outputs a menu to the user and recives the input.
 */


public class Menu {

    private int result;
    private String searchKey;

    /**
     * This method prompts the user and returns an int.
     * @return
     */
    public int optionMenu() {
        return result;
    }

    /**
     * THis method asks the user for the search keyword
     * @return
     */
    public String searchKey(){
         return searchKey;
    }

}
