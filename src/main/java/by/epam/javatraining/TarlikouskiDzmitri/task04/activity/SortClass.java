package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

/**
 * Bubble sorts for various parameters.
 *
 * @author Dzmitri Tarlikovski
 * @date 12.08.2019
 * @version  1.0
 */

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators.*;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;

public class SortClass {

    public SortClass() {


    }

    /**
     * Sort employees.
     *
     * @param comparator - which one you would use.
     * @param teamMembers - collection with employees
     */

    public void sortEmployees(IEmployeeComparator comparator, TeamMembers teamMembers) {

        int size = teamMembers.numberOfEmployees();

        for(int i=0;i<size-1;i++) {
            for(int j=i+1;j<size;j++) {
                if(comparator.compare(teamMembers.getEmployee(j-1),teamMembers.getEmployee(j))>1) {
                    Employee temp = teamMembers.getEmployee(j-1);
                    teamMembers.setEmployees(j-1, teamMembers.getEmployee(j));
                    teamMembers.setEmployees(j,temp);
                }
            }
        }
    }

}
