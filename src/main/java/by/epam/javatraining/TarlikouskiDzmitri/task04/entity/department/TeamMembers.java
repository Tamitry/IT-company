package by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department;


/**
 * Collection of employees with simple actions.
 *
 * @author Dzmitri Tarlikouski
 * date 12.08.2019
 * @version 1.0
 */

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;

import java.util.*;

public class TeamMembers {

    private ArrayList<Employee> employees;

    public TeamMembers() {

        employees = new ArrayList<>();

    }

    public void addEmpolyee(Employee employee) {
        employees.add(employee);
    }

    public Employee getEmployee(int index) {
        return employees.get(index);
    }

    public void setEmployees(int index, Employee employee) {
        employees.set(index,employee);
    }

    public int numberOfEmployees() {
        return  employees.size();
    }

    public boolean isEmpty() {
        return employees.isEmpty();
    }

    @Override
    public String toString() {

        String str = "List of employees: \n";

        for (Employee employee:employees) {
            str = str + employee.toString()+"\n";
        }

        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) {
            return true;
        }
        if(!(obj instanceof TeamMembers)||obj==null) {
            return false;
        }

        TeamMembers teamMembers = (TeamMembers)obj;

        if(this.numberOfEmployees()!=teamMembers.numberOfEmployees()) {
            return false;
        }

        int size = this.numberOfEmployees();
        boolean flag = true;

        for(int i=0;i<size;i++) {
            if(!this.getEmployee(i).equals(teamMembers.getEmployee(i))) {
                flag = false;
            }
        }

        return flag;
    }

    @Override
    public int hashCode() {

        int size = numberOfEmployees();
        int sum=0;

        for(int i=0;i<size;i++) {
            sum+=employees.get(i).hashCode()/(i*100);
        }

        return sum+size;
    }

}
