package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

/**
 * This static class work with the file, which contains list of employees< checks it and create String var with
 * various information about employees.
 *
 * @author Dzmitri Tarlikovski
 * @date 11.08.2019
 * @version  1.0
 */

import by.epam.javatraining.TarlikouskiDzmitri.task04.validation.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TakeListFromFile {

    private Validator validator;
    private static final Logger LOGGER = LogManager.getLogger(TakeListFromFile.class);

    public TakeListFromFile() {

        validator = new Validator();

    }

    /**
     *Take text from files and check it with validate(). Return list with all valid lines.
     *
     * @param path - path to resource file
     * @return ArrayList - with all valid lines.
     */
    public ArrayList<String> importText(String path){

        ArrayList<String> strToImport = new ArrayList<String>();

        try {
            FileReader fr = new FileReader(path);
            Scanner sc = new Scanner(fr);

            while (sc.hasNext()) {

                String str = sc.nextLine();
                if(validator.validate(str)) {
                    strToImport.add(str);
                }
            }

        }
        catch (FileNotFoundException ex) {
            LOGGER.error(ex.getMessage());
        }
        catch (IOException ex) {
            LOGGER.error(ex.getMessage());
        }


        return strToImport;
    }

}
