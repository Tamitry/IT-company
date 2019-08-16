package by.epam.javatraining.TarlikouskiDzmitri.task04.validation;

import by.epam.javatraining.TarlikouskiDzmitri.task04.exception.NotAvailableTypeOfEmployee;

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
     * @param str - line
     * @return - true & false
     */
    public boolean validate(String str) throws NotAvailableTypeOfEmployee {

            String[] sepStr = str.split(" ", 5);

            if (sepStr[0].length() > 16 ||sepStr[0].length() < 3) {

                return false;

            }

            if (sepStr[1].length() > 16 || sepStr[1].length() < 3) {

                return false;

            }

            try {
                if (Integer.parseInt(sepStr[2]) < 15 || Integer.parseInt(sepStr[2]) > 80) {

                    return false;

                }

                if (Integer.parseInt(sepStr[2]) < Integer.parseInt(sepStr[3]) || Integer.parseInt(sepStr[3]) < 0) {

                    return false;

                }

                if (Integer.parseInt(sepStr[4]) < 0 || Integer.parseInt(sepStr[4]) > 10000000) {

                    return false;

                }
            }
            catch (NumberFormatException ex) {

                System.out.println(ex.getMessage());

            }

        return true;
    }
}
