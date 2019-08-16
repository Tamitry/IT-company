package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;

public class SalarySumCounter {



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
