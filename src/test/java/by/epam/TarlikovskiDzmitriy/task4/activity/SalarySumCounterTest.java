package by.epam.TarlikovskiDzmitriy.task4.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.SalarySumCounter;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import org.junit.Assert;
import org.junit.Test;

public class SalarySumCounterTest {

    @Test
    public void sumSalaryTest_equals() {
        TeamMembers teamMembers = new TeamMembers();
        teamMembers.addEmpolyee(new Developer("A","D",29,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","E",30,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","C",22,5,1200, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","B",19,5,1000, Languages.JAVA));
        teamMembers.addEmpolyee(new Developer("A","A",6,5,1500, Languages.JAVA));

        int expected = 6100;
        int actual =SalarySumCounter.sumSalary(teamMembers);

        Assert.assertEquals(expected, actual);
    }

}
