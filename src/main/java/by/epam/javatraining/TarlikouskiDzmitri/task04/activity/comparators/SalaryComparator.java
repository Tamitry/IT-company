package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        Integer salary1 = e1.getSalary();
        Integer salary2 = e2.getSalary();
        return salary1.compareTo(salary2);
    }
}
