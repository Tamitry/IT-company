package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;
import org.junit.Test;
import org.testng.Assert;

import java.util.ArrayList;

public class SalaryFilterTest {

    private SalaryFilter salaryFilter = new SalaryFilter();

    @Test
    public void salaryFilterTestFromTo() {
        Integer from = 1500;
        Integer to = 2000;
        TeamMembers teamMembers = new TeamMembers();
        teamMembers.addEmpolyee(new Employee("Assd","a2sd", 21, 12, 1200));
        teamMembers.addEmpolyee(new Employee("Asd1d","a1sd", 21, 12, 1700));
        teamMembers.addEmpolyee(new Employee("Ass32d","asd", 21, 12, 1221));
        teamMembers.addEmpolyee(new Employee("Ass24d","a21sd", 21, 12, 12300));
        teamMembers.addEmpolyee(new Employee("As4sd","as2d", 21, 12, 121200));
        teamMembers.addEmpolyee(new Employee("As21sd","a32sd", 21, 12, 12300));
        teamMembers.addEmpolyee(new Employee("Asa1d","a11sd", 21, 12, 1800));

        ArrayList<Employee> expectedTeam = new ArrayList<Employee>();
        expectedTeam.add(new Employee("Asd1d","a1sd", 21, 12, 1700));
        expectedTeam.add(new Employee("Asa1d","a11sd", 21, 12, 1800));

        ArrayList<Employee> actualMembers = salaryFilter.salaryFilter(teamMembers,from,to);
        Assert.assertTrue(actualMembers.equals(expectedTeam));
    }

    @Test
    public void salaryFilterTestValueMode() {
        Integer Value = 10000;
        Integer to = 2000;
        TeamMembers teamMembers = new TeamMembers();
        teamMembers.addEmpolyee(new Employee("Assd","a2sd", 21, 12, 1200));
        teamMembers.addEmpolyee(new Employee("Asd1d","a1sd", 21, 12, 1700));
        teamMembers.addEmpolyee(new Employee("Ass32d","asd", 21, 12, 1221));
        teamMembers.addEmpolyee(new Employee("Ass24d","a21sd", 21, 12, 12300));
        teamMembers.addEmpolyee(new Employee("As4sd","as2d", 21, 12, 121200));
        teamMembers.addEmpolyee(new Employee("As21sd","a32sd", 21, 12, 12300));
        teamMembers.addEmpolyee(new Employee("Asa1d","a11sd", 21, 12, 1800));

        ArrayList<Employee> expectedTeam = new ArrayList<Employee>();
        expectedTeam.add(new Employee("As4sd","as2d", 21, 12, 121200));
        expectedTeam.add(new Employee("Ass24d","a21sd", 21, 12, 12300));
        expectedTeam.add(new Employee("As21sd","a32sd", 21, 12, 12300));

        ArrayList<Employee> actualMembers = salaryFilter.salaryFilter(teamMembers,Value,true);
        Assert.assertEquals(actualMembers,expectedTeam);
    }
}
