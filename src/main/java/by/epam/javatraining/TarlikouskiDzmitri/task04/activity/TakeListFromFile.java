package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

/**
 * This static class work with the file, which contains list of employees< checks it and create String var with
 * various information about employees.
 *
 * @author Dzmitri Tarlikovski
 * @date 11.08.2019
 * @version  1.0
 */

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.*;
import by.epam.javatraining.TarlikouskiDzmitri.task04.validation.Validator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TakeListFromFile {

    private Validator validator;
    private TeamMembers teamMembers;

    public TakeListFromFile() {

        validator = new Validator();
        teamMembers = new TeamMembers();

    }

    /**
     *
     *
     * @param path - path to resource file
     */
    public String[] importText(String path) throws IOException{

        FileReader fw = new FileReader(path);

    }

}
