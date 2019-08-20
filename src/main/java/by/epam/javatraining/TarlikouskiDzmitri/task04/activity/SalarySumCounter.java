package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

/**
 * Static class with util function of counting the sum of team salaries.
 *
 * @author DizmitriyTarlikouski
 * date 16.08.2019
 * @version 1.0
 */

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;

public class SalarySumCounter {


    private SalarySumCounter() {

    }

    /**
     * Return the sum of all salaries.
     *
     * @param teamMembers
     * @return
     */
    public static int sumSalary(TeamMembers teamMembers) {

        int sum = 0;
        int size = teamMembers.numberOfEmployees();
        for(int i=0;i<size;i++) {
            sum+=teamMembers.getEmployee(i).getSalary();
        }

        return sum;
    }
}
