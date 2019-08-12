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
import java.io.IOException;

public class TakeListFromFile {

    private Validator validator;
    private TeamMembers teamMembers;

    public TakeListFromFile() {

        validator = new Validator();
        teamMembers = new TeamMembers();

    }

    /**
     * I think I violated Single Responsibility principle.
     *
     * @param path - path to resource file
     */
    public String importText(String path) {

        String expString = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))){

            String str;

            while ((str=reader.readLine())!=null) {

                Integer age;
                Integer experience;
                Integer salary;

                if (validator.validate(str)) {

                    expString = expString + str;
                    String[] exp = str.split(" ", 6);

                    try {
                        age = Integer.parseInt(exp[2]);
                        experience = Integer.parseInt(exp[3]);
                        salary = Integer.parseInt(exp[4]);

                        switch (exp[5]) {
                            case "tester":
                                teamMembers.addEmpolyee(new Tester(exp[0],exp[1],age,experience,salary));
                                break;
                            case "developer":
                                teamMembers.addEmpolyee(new Developer(exp[0],exp[1],age,experience,salary));
                                break;
                            case "viser":
                                teamMembers.addEmpolyee(new Viser(exp[0],exp[1],age,experience,salary));
                                break;
                            case "project manager":
                                teamMembers.addEmpolyee(new Project_Manager(exp[0],exp[1],age,experience,salary));
                                break;
                            case "analyst":
                                teamMembers.addEmpolyee(new Analyst(exp[0],exp[1],age,experience,salary));
                                break;
                            default:
                                break;
                        }
                    }
                    catch (NumberFormatException ex) {
                        System.out.println(ex.getMessage());
                    }

                }
            }
            if(reader!=null) {
                reader.close();;
            }

        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return expString;
    }

}
