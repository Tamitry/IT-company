package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory;

/**
 * One of the factory elements.
 *
 * @author DzmitriyTarlikouski
 * date 16.08.2019
 * @version 1.0
 */

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import by.epam.javatraining.TarlikouskiDzmitri.task04.exception.NotAvailableTypeOfEmployee;

public class DeveloperFactory extends AbstactFactory {


    /**
     * Return new developer with given parameters.
     *
     * @param str
     * @return
     */
    @Override
    public Developer build(String[] str){

        Developer dev = new Developer();
        fill(str,dev);
        setLanguage(str,dev);

        return dev;
    }

    /**
     * This method set programming language for new developer.
     *
     * @param str
     * @param dev
     */
    private void setLanguage(String[] str, Developer dev){

        try {
            switch (str[5]) {
                case "Java":
                    dev.setLanguage(Languages.JAVA);
                    break;
                case "Ruby":
                    dev.setLanguage(Languages.RUBY);
                    break;
                case "Python":
                    dev.setLanguage(Languages.PYTHON);
                    break;
                default:
                    throw new NotAvailableTypeOfEmployee("Incorrect programmer's language.");
            }
        }

        catch (NotAvailableTypeOfEmployee ex) {
            System.out.println(ex.getMessage());
        }
    }
}
