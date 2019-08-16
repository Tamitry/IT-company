package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;

import java.util.Comparator;

public interface IEmployeeComparator extends Comparator<Employee> {
    int compare(Employee e1, Employee e2);
}
