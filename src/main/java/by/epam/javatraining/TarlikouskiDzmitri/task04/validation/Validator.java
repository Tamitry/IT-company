package by.epam.javatraining.TarlikouskiDzmitri.task04.validation;

import by.epam.javatraining.TarlikouskiDzmitri.task04.exception.NotAvailableTypeOfEmployee;

import java.util.regex.Pattern;

/**
 * Static class for сhecking value of various class fields.
 *
 * @author Dzmitri Tarlikovski
 * date 05.08.2019
 * @version  1.0
 */


public final class Validator {

    public Validator() {

    }

    /**
     * Is the line valid?
     * It's much more easier to use pattern, but I don't know the right way to use it for now.
     * Right format [name] [surname], [age], [experience], [salary], [number/word], [occupation]
     *
     * @param str - line
     * @return - true & false
     */
    public boolean validate(String str) throws NotAvailableTypeOfEmployee {


        String[] sepStr = str.split(", ");

        if(sepStr.length<6) {
            return false;
        }

        if(!sepStr[0].matches("[a-zA-Z]+.+[a-zA-Z]+")) {
            return false;
        }

        if(!sepStr[1].matches("[0-9]+")) {
            return false;
        }

        if(!sepStr[2].matches("[0-9]+")) {
            return false;
        }

        if(!sepStr[3].matches("[0-9]+")) {
            return false;
        }

        if(!sepStr[4].matches("[a-zA-Z]+||[0-9]+")) {
            return false;
        }

        if(!sepStr[5].matches("[a-zA-Z]+")) {
            return false;
        }

        if (sepStr[0].length() > 30 ||sepStr[0].length() < 3) {

            return false;

        }

        try {
            if (Integer.parseInt(sepStr[1]) < 15 || Integer.parseInt(sepStr[1]) > 80) {

                return false;

            }

            if (Integer.parseInt(sepStr[1]) < Integer.parseInt(sepStr[2]) || Integer.parseInt(sepStr[2]) < 0) {

                return false;

            }

            if (Integer.parseInt(sepStr[3]) < 0 || Integer.parseInt(sepStr[3]) > 10000000) {

                return false;

            }
        }
        catch (NumberFormatException ex) {

            System.out.println(ex.getMessage());

        }

        return true;
    }
}
