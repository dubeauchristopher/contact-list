package program;
/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/16/14
 * Description:
 * Define a reuseable class InputDate.
 * One object of class InputDate reads and stores the users inputs.
 */

import java.util.Scanner;
public class  InputData {

	private String firstName; //FirstName is a data member
	private String lastName; // LastName is a data member
	private String streetAddress; // StreetAddress is a data member
	private String emailAddress;  // EmailAddress is a data member
	private int phoneNumber=0; //PhoneNumber is a data member
	private String notes;  //Notes is a data member

	public void InputDate (){   //Creat an object which reads and stores readers' inputs
		Scanner scanner = new Scanner(System.in);
		 firstName = scanner.next();
		 lastName = scanner.next();
		 streetAddress = scanner.next();
		 emailAddress = scanner.next();
		 phoneNumber = scanner.nextInt();
		 notes = scanner.next();
		 }
}

