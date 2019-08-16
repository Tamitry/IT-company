package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;

import java.util.Comparator;

public class AgeComparator implements IEmployeeComparator{
    public int compare(Employee e1, Employee e2) {
        Integer age1 = e1.getAge();
        Integer age2 = e2.getAge();
        return age1.compareTo(age2);
    }
}
