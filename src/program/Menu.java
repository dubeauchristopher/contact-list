import java.util.Scanner;
package program;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Hu
 * Date: 11/15/14
 * Description:
 */


public class Menu {
		Scanner keyboard = new Scanner(System.in);
		
		
		 System.out.println("-- Actions --");
		    System.out.println(
		        "Select an option: \n" +
		        "  1) Enter a new person\n" +
		        "  2) Print the contact list\n" +
		        "  3) Retreive a persons information by last name \n" +
		        "  4) Retrieve a person's information by email address\n " +
		        " 5) Retrieve all people who live in a given zip code \n" +
		        "  0) Exit menu"
		    );
		    
		    int selection = keyboard.nextInt();
		    keyboard.nextLine();
		    
		    
		    	
	
		    
		    while (selection > 0 && selection < 6){
		    	switch (selection){
		    	case 1:
		    		//Enter new person
		    		break;
		    	case 2:
		    		// Print the information
		    		break;
		    	case 3: 
		    		// Retrieve info by last name
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
