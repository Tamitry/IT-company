package by.epam.TarlikovskiDzmitriy.task4.activity.comparators;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators.SurnameComparator;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import org.junit.Assert;
import org.junit.Test;

public class SurnameComporatorTest {

    @Test
    public void compareTest_true() {
        SurnameComparator surnameComporator = new SurnameComparator();
        Employee e1 = new Developer("A","A",19,5,1200, Languages.JAVA);
        Employee e2 = new Developer("A","D",22,5,1200, Languages.JAVA);

        Assert.assertTrue(surnameComporator.compare(e1,e2)<0);
    }
}
