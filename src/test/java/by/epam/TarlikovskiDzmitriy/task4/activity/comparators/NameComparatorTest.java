package by.epam.TarlikovskiDzmitriy.task4.activity.comparators;


import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators.NameComparator;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import org.junit.Assert;
import org.junit.Test;

public class NameComparatorTest {

    @Test
    public void compareTest_true() {
        NameComparator nameComparator = new NameComparator();
        Employee e1 = new Developer("A","A",19,5,1200, Languages.JAVA);
        Employee e2 = new Developer("C","A",22,5,1200, Languages.JAVA);

        Assert.assertTrue(nameComparator.compare(e1,e2)<0);
    }
}
