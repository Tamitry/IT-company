package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory;

/**
 * One of the factory elements.
 *
 * @author DzmitriyTarlikouski
 * date 16.08.2019
 * @version 1.0
 */

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;
import by.epam.javatraining.TarlikouskiDzmitri.task04.exception.FactoryException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EmployeeFactory {

    private static final Logger LOGGER = LogManager.getLogger(EmployeeFactory.class);

    public EmployeeFactory() {

    }

    /**
     * Return new employee with given parameters.
     *
     * @param str
     * @return
     */
    public Employee build(String[] str) {

        AbstactFactory abstactFactory = null;

        try {
            switch (str[6]) {
                case "developer":
                    abstactFactory = new DeveloperFactory();
                    break;
                case "tester":
                    abstactFactory = new TesterFactory();
                    break;
                case "project manager":
                    abstactFactory = new ProjectManagerFactory();
                    break;
                default:
                    throw new FactoryException("There is no such occupation.");
            }
        }
        catch (FactoryException ex){
            LOGGER.error(ex.getMessage());
        }

        Employee employee = null;
        employee = abstactFactory.build(str);
        return employee;
    }

}
