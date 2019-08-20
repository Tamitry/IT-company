package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;
import by.epam.javatraining.TarlikouskiDzmitri.task04.exception.FactoryException;

public class EmployeeFactory {

    public EmployeeFactory() {

    }

    public Employee build(String[] str) {

        AbstactFactory abstactFactory = null;

        try {
            switch (str[6]) {
                case "developer":
                    abstactFactory = new DeveloperFactory();
                    break;
                case "tester":
                    abstactFactory = new TesterBuilder();
                    break;
                case "project manager":
                    abstactFactory = new ProjectManagerBuilder();
                    break;
                default:
                    throw new FactoryException("There is no such occupation.");
            }
        }
        catch (FactoryException ex){
            System.out.println(ex.getMessage());
        }

        Employee employee = null;
        employee = abstactFactory.build(str);
        return employee;
    }

}
