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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class takeListFromFile {

    private Validator validator;

    public takeListFromFile() {

        validator = new Validator();

    }

    public String importText(String path) {

        String expText = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("Resources.txt"))){

            String str;

            while ((str=reader.readLine())!=null) {
                if (validator.validate(str)) {

                    //               expText=expText + Validation.validation(str); нужен метод, для добавления в список

                }
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return expText;
    }
}
