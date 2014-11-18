package program;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Hu
 * Date: 11/15/14
 * Description:  This is the main class for the program contact list.
 */
public class ContactList {


    public static void main(String args[]) throws Exception {

        Menu menu = new Menu();
        InputData inputData = new InputData();
        String searchKey = menu.searchKey();
        ReadData readData = new ReadData();
        SaveData saveData = new SaveData(inputData.inputData());
        SearchData searchData = new SearchData(readData.retrieveData(), searchKey);
        Print print = new Print(readData);
        System.out.println(print.printData());

    }

}

/*
Testing the output of the program.
 */
