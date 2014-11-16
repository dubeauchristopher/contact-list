package program;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/**
 * @author Christopher Dubeau
 * @author Ron Rayas
 * @author Harpreet Setia
 * @author Long Hu
 * Date: 11/15/14
 * Description:
 */
public class ReadData {

    private List contactData[];

    /**
     * THis method reads from a file and stores each line in a List
     * @return
     */
    public List retrieveData(String csvFile) throws Exception {

        File file = new File(csvFile);
        List result = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        return result;

    }



}
