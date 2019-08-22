package by.epam.TarlikovskiDzmitriy.task4.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.SortClass;
import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators.AgeComporator;
import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators.SurnameComparator;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import org.junit.Test;
import org.testng.Assert;

public class SortTest {

    @Test
    public void sortEmployeesAge_true() {

        TeamMembers teamMembers = new TeamMembers();
        teamMembers.addEmpolyee(new Developer("A","A",29,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","A",30,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","A",22,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","A",19,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","A",6,5,1200, Languages.JAVA));

        TeamMembers expectedTeam = new TeamMembers();
        expectedTeam.addEmpolyee(new Developer("A","A",6,5,1200, Languages.JAVA));
        expectedTeam.addEmpolyee(new Developer("A","A",19,5,1200, Languages.JAVA));
        expectedTeam.addEmpolyee(new Developer("A","A",22,5,1200, Languages.JAVA));
        expectedTeam.addEmpolyee(new Developer("A","A",29,5,1200, Languages.JAVA));
        expectedTeam.addEmpolyee(new Developer("A","A",30,5,1200, Languages.JAVA));

        SortClass sortClass = new SortClass();
        sortClass.sortEmployees(new AgeComporator(),teamMembers);

        Assert.assertTrue(teamMembers.equals(expectedTeam));
    }

    @Test
    public void sortEmployeesSurname_true() {

        TeamMembers teamMembers = new TeamMembers();
        teamMembers.addEmpolyee(new Developer("A","D",29,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","E",30,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","C",22,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","B",19,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","A",6,5,1200, Languages.JAVA));

        TeamMembers expectedTeam = new TeamMembers();
        expectedTeam.addEmpolyee(new Developer("A","A",6,5,1200, Languages.JAVA));
        expectedTeam.addEmpolyee(new Developer("A","B",19,5,1200, Languages.JAVA));
        expectedTeam.addEmpolyee(new Developer("A","C",22,5,1200, Languages.JAVA));
        expectedTeam.addEmpolyee(new Developer("A","D",29,5,1200, Languages.JAVA));
        expectedTeam.addEmpolyee(new Developer("A","E",30,5,1200, Languages.JAVA));

        SortClass sortClass = new SortClass();
        sortClass.sortEmployees(new SurnameComparator(),teamMembers);

        Assert.assertTrue(teamMembers.equals(expectedTeam));
    }
}
