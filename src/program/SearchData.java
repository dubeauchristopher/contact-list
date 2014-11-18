package program;

import java.util.List;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/15/14
 * Description: This class recieves a class and search string.
 * The three public methods will use the string to seach by a given value and return a List
 */
public class SearchData {

    private List data;
    private String key;
    private List zipResult;
    private List emailResult;
    private List lastNameResult;

    public SearchData(List readData, String searchKey){
        key = searchKey;
        data = readData;
    }

    /**
     * This method searches by the last name and returns List of data
     * @return
     */
    public List searchByLastName(){
          return lastNameResult;
    }

    /**
     * This method searches by zip code and returns List of data
     * @return
     */
    public List searchByZip(){
        return zipResult;
    }


    /**
     * This method searches by the email address and returns List of data
     * @return
     */
    public List searchByEmail(){
         return emailResult;
    }



}
