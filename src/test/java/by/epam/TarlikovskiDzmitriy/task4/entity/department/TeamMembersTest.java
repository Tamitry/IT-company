package by.epam.TarlikovskiDzmitriy.task4.entity.department;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import org.junit.Assert;
import org.junit.Test;

public class TeamMembersTest {

    @Test
    public void teamMembersMethods_true() {
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;


        TeamMembers teamMembers = new TeamMembers();
        flag1 = teamMembers.isEmpty();

        teamMembers.addEmpolyee(new Developer("Asde", "Ewrt", 22,
                2, 1500, Languages.JAVA));
        flag2 = !teamMembers.isEmpty();

        flag3=(teamMembers.getEmployee(0).equals(new Developer("Asde", "Ewrt", 22,
                2, 1500, Languages.JAVA)));

        teamMembers.setEmployees(0,new Developer("ASDsde", "aDSrt", 22,
                2, 1500, Languages.RUBY));

        flag4=(teamMembers.getEmployee(0).equals(new Developer("ASDsde", "aDSrt", 22,
                2, 1500, Languages.RUBY)));

        Assert.assertTrue(flag1&&flag2&&flag3&&flag4);
        Assert.assertEquals(1,teamMembers.numberOfEmployees());

    }
}
