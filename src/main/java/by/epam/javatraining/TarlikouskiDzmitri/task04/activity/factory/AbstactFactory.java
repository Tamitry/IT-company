package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory;

/**
 * One of the factory elements.
 *
 * @author DzmitriyTarlikouski
 * date 16.08.2019
 * @version 1.0
 */

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;
import by.epam.javatraining.TarlikouskiDzmitri.task04.exception.NotAvailableTypeOfEmployee;

public abstract class AbstactFactory {

    public abstract Employee build(String[] str);

    public void fill(String[] str, Employee employee) {

        employee.setName(str[0]);
        employee.setSurname(str[1]);

        try{
            Integer age = Integer.parseInt(str[2]);
            Integer experience = Integer.parseInt(str[3]);
            Integer salary = Integer.parseInt(str[4]);

            employee.setAge(age);
            employee.setExp(experience);
            employee.setSalary(salary);
        }
        catch (NumberFormatException ex) {
            System.out.println(ex.getMessage()+" incorrect number format. Expected int number.");
        }
    }
}
