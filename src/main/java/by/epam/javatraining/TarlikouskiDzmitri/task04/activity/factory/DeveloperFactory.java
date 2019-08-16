package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import by.epam.javatraining.TarlikouskiDzmitri.task04.exception.NotAvailableTypeOfEmployee;

public class DeveloperFactory extends AbstactFactory {

    @Override
    public Developer build(String[] str) throws NotAvailableTypeOfEmployee {

        Developer dev = new Developer();
        fill(str,dev);
        setLanguage(str,dev);

        return dev;
    }

    private void setLanguage(String[] str, Developer dev) throws NotAvailableTypeOfEmployee{

        try {
            switch (str[5]) {
                case "Java":
                    dev.setLanguage(Languages.Java);
                    break;
                case "C":
                    dev.setLanguage(Languages.C);
                    break;
                case "Python":
                    dev.setLanguage(Languages.Python);
                    break;
                default:
                    throw new NotAvailableTypeOfEmployee("Incorrect programming language.");
            }
        }

        catch (NotAvailableTypeOfEmployee ex) {
            System.out.println(ex.getMessage());
        }
    }
}
