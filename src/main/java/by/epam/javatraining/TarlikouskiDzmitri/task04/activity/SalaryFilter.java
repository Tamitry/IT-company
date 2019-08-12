package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

/**
 * This class offers various kinds of sorts.
 *
 * @author Dzmitri Tarlikovski
 * date 12.08.2019
 * @version 1.0
 */

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;

import java.util.ArrayList;

public class SalaryFilter {

    private ArrayList<Employee> fitEmployees;

    public SalaryFilter() {
        fitEmployees = new ArrayList<Employee>();
    }

    /**
     *
     * @param teamMembers - filtered object
     * @param from - higher than this
     * @param to - but lower than this
     * @return - result which contains the employees we need
     */
    public ArrayList<Employee> salaryFilter(TeamMembers teamMembers, int from, int to) {

        int size = teamMembers.numberOfEmployees();

        for (int i = 0 ; i < size ; i++) {

            //May be it would be easier to create int variable and assign result of method getSalary().
            Employee employee = teamMembers.getEmployee(i);

            if (employee.getSalary() > from && employee.getSalary() < to) {

                fitEmployees.add(employee);

            }
        }

        return fitEmployees;
    }

    /**
     *
     * @param teamMembers - filtered object
     * @param value - higher of lower than
     * @param mode - mode = true - higher than value
     *             - mode = false - lower than value
     * @return - result which contains the employees we need
     */
    //Overloaded method
    public ArrayList<Employee> salaryFilter(TeamMembers teamMembers, int value, boolean mode) {

        int size = teamMembers.numberOfEmployees();

        for (int i = 0 ; i < size ; i++) {

            //May be it would be easier to create int variable and assign result of method getSalary().
            Employee employee = teamMembers.getEmployee(i);

            if (employee.getSalary() > value && mode) {

                fitEmployees.add(employee);

            }
            if (employee.getSalary() < value && !mode) {

                fitEmployees.add(employee);

            }
        }

        return fitEmployees;
    }

}