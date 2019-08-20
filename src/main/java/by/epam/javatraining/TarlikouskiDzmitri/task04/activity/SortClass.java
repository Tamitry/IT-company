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

        for(int i=size-1;i>0;i--) {
            for(int j=0;j<i;j++) {
                if(comparator.compare(teamMembers.getEmployee(j),teamMembers.getEmployee(j+1))>0) {
                    Employee temp = teamMembers.getEmployee(j);
                    teamMembers.setEmployees(j, teamMembers.getEmployee(j+1));
                    teamMembers.setEmployees(j+1,temp);
                }
            }
        }
    }

}
