package by.epam.TarlikovskiDzmitriy.task4.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.Control;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Tester;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.TestType;
import org.junit.Assert;
import org.junit.Test;

public class ControlTest {

    @Test
    public void collectTeamTest_equals() {

        Control control = new Control();
        TeamMembers teamMembers = control.collectTeam("./src/test/resource/Resource.txt");
        TeamMembers expectedTeam = new TeamMembers();
        expectedTeam.addEmpolyee(new Tester("Aleksei", "Ewart", 24, 3, 1000, TestType.MANUAL));
        expectedTeam.addEmpolyee(new Tester("Ivan", "Dayan", 21, 1, 1100, TestType.AUTOMATIC));
        expectedTeam.addEmpolyee(new Tester("Nicholas", "Watson", 30, 6, 600, TestType.AUTOMATIC));

        Assert.assertEquals(expectedTeam, teamMembers);

    }
}
