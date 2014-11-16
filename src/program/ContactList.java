package program;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Hu
 * Date: 11/15/14
 * Description:
 */
public class ContactList {

    public static void main(String ars[]){

        Menu menu = new Menu();
        InputData inputData = new InputData();

        int selection = menu.optionMenu();
        ReadData readData = new ReadData();


        while(selection >0 && selection < 6)
        {
            switch (selection) {
                case 1:
                    //Enter new person
                    break;
                case 2:
                    // Print the information
                    break;
                case 3:
                    // Retrieve info by last name4
                    break;
                case 4:
                    //Retrieve info by email
                    break;
                case 5:
                    //Retrieve info by zip code
                    break;
                case 0:
                    selection = 6;
                    break;
                default:
                    System.out.println("Invalid selection.");
                    break;
            }

        }

    }

}
