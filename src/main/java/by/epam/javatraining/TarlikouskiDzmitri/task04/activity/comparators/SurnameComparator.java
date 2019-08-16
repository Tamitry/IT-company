package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;

import java.util.Comparator;

public class SurnameComparator implements IEmployeeComparator {

    public int compare(Employee e1, Employee e2) {
        return e1.getSurname().compareTo(e2.getSurname());
    }
}
