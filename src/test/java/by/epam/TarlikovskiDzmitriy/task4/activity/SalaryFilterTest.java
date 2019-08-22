package by.epam.TarlikovskiDzmitriy.task4.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.SalaryFilter;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SalaryFilterTest {

    @Test
    public void salaryFilterTestModeFromTo_equals() {
        SalaryFilter salaryFilter = new SalaryFilter();
        TeamMembers teamMembers = new TeamMembers();
        teamMembers.addEmpolyee(new Developer("A","D",29,5,200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","E",30,5,8200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","C",22,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","B",19,5,3200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","A",6,5,2200, Languages.JAVA));

        ArrayList<Employee> employeeArrayList = salaryFilter.salaryFilter(teamMembers,1000,3000);
        ArrayList<Employee> expectedEmployees = new ArrayList<>();
        expectedEmployees.add(new Developer("A","C",22,5,1200, Languages.JAVA));
        expectedEmployees.add(new Developer("A","A",6,5,2200, Languages.JAVA));

        Assert.assertEquals(expectedEmployees,employeeArrayList);
    }

    @Test
    public void salaryFilterTestModeUpperLower_equals() {
        SalaryFilter salaryFilter = new SalaryFilter();
        TeamMembers teamMembers = new TeamMembers();
        teamMembers.addEmpolyee(new Developer("A","D",29,5,200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","E",30,5,8200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","C",22,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","B",19,5,3200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","A",6,5,2200, Languages.JAVA));

        ArrayList<Employee> employeeArrayList = salaryFilter.salaryFilter(teamMembers,3000,true);
        ArrayList<Employee> expectedEmployees = new ArrayList<>();
        expectedEmployees.add(new Developer("A","E",30,5,8200, Languages.JAVA));
        expectedEmployees.add(new Developer("A","B",19,5,3200, Languages.JAVA));

        Assert.assertEquals(expectedEmployees,employeeArrayList);
    }
}
