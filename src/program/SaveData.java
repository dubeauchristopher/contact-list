package program;

import java.io.FileWriter;
import java.util.List;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Xu
 * Date: 11/15/14
 * Description:
 */
public class SaveData {

    private List<String[]> data;

    public SaveData(List list){
         data = list;
    }

    /**
     * This method receives a List from memory and writes to a file.
     */
    public void saveData(String csvFile, List contents) throws Exception {
        CSVWriter writer = new CSVWriter(new FileWriter(csvFile));
        writer.writeAll(contents);
        writer.close();

    }

}
