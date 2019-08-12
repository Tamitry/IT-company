package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;
import org.junit.Test;
import org.testng.Assert;

public class SortClassTest {
    //Just a few of them. They are the same.
    private SortClass sortClass = new SortClass();

    @Test
    public void sortNameClassTest() {

        TeamMembers teamMembers = new TeamMembers();
        teamMembers.addEmpolyee(new Employee("A","E",18,1,1200));
        teamMembers.addEmpolyee(new Employee("D","A",19,4,1200));
        teamMembers.addEmpolyee(new Employee("C","W",30,3,1800));
        teamMembers.addEmpolyee(new Employee("V","C",38,7,3000));

        TeamMembers expectedTeam = new TeamMembers();
        expectedTeam.addEmpolyee(new Employee("A","E",18,1,1200));
        expectedTeam.addEmpolyee(new Employee("C","W",30,3,1800));
        expectedTeam.addEmpolyee(new Employee("D","A",19,4,1200));
        expectedTeam.addEmpolyee(new Employee("V","C",38,7,3000));

        sortClass.sortName(teamMembers);

        Assert.assertEquals(teamMembers,expectedTeam);
    }

    @Test
    public void sortAgeClassTest() {
        TeamMembers teamMembers = new TeamMembers();
        teamMembers.addEmpolyee(new Employee("D","A",19,4,1200));
        teamMembers.addEmpolyee(new Employee("A","E",18,1,1200));
        teamMembers.addEmpolyee(new Employee("V","C",38,7,3000));
        teamMembers.addEmpolyee(new Employee("C","W",30,3,1800));

        TeamMembers expectedTeam = new TeamMembers();
        teamMembers.addEmpolyee(new Employee("A","E",18,1,1200));
        teamMembers.addEmpolyee(new Employee("D","A",19,4,1200));
        teamMembers.addEmpolyee(new Employee("C","W",30,3,1800));
        teamMembers.addEmpolyee(new Employee("V","C",38,7,3000));

        Assert.assertEquals(teamMembers,expectedTeam);
    }
}
