package program;

import java.util.List;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/15/14
 * Description:
 */
public class SearchData {

    private List<String[]> data;
    private String key;

    public SearchData(ReadData readData, String searchKey){
        readData = data;
        key = searchKey;
    }

    /**
     * This method searches by the last name and returns List of data
     * @return
     */
    public List searchByLastName(){

    }

    /**
     * This method searches by zip code and returns List of data
     * @return
     */
    public List searchByZip(){

    }


    /**
     * This method searches by the email address and returns List of data
     * @return
     */
    public List searchByEmail(){

    }



}
