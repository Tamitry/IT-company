package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.Employee;

import java.sql.Array;
import java.util.*;

public class ListOfTeam {

    ArrayList<Employee> employees;

    public ListOfTeam() {

        employees = new ArrayList<Employee>();

    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getValueOf(int i) {
        return employees.get(i);
    }


    public int getSummurySalary() {

        int sum = 0;

        if(employees.isEmpty()) {
            return 0;
        }

        for(Employee employee: employees) {

            sum+=employee.getSalary();
        }

        return sum;
    }

    @Override
    public String toString() {

        String txt = "List of employee: \n";

        for(Employee employee: employees) {
            txt=txt+employee.toString()+"\n";
        }

        return txt;
    }

}
