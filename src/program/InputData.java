package program;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/15/14
 * Description:
 * Define a reuseable class InputDate.
 * One object of class InputDate reads and stores the users inputs.
 */ 
 import java.util.Scanner; // import Scanner 
public class  InputData { 

	private String FirstName; //FirstName is a data member
	private String LastName; // LastName is a data member
	private String StreetAddress; // StreetAddress is a data member
	private String EmailAddress;  // EmailAddress is a data member
	private int PhoneNumber=0; //PhoneNumber is a data member
	private String Notes;  //Notes is a data member
	
	public void InputDate (){   //Creat an object which reads and stores readers' inputs
		Scanner scanner = new Scanner(System.in); 
		 FirstName = scanner.next();
		 LastName = scanner.next();
		 StreetAddress = scanner.next();
		 EmailAddress = scanner.next();
		 PhoneNumber = scanner.nextInt();
		 Notes = scanner.next();
		 }
}
