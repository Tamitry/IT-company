package by.epam.TarlikovskiDzmitriy.task4.activity.comparators;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators.ExperienceComparator;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import org.junit.Assert;
import org.junit.Test;

public class ExperienceComporatorTest {

    @Test
    public void compareTest_true() {
        ExperienceComparator experienceComparator = new ExperienceComparator();
        Employee e1 = new Developer("A","A",19,5,1200, Languages.JAVA);
        Employee e2 = new Developer("A","A",22,6,1200, Languages.JAVA);

        Assert.assertTrue(experienceComparator.compare(e1,e2)<0);
    }
}
