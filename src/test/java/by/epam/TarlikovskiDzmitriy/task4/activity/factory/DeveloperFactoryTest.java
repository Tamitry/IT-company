package by.epam.TarlikovskiDzmitriy.task4.activity.factory;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory.DeveloperFactory;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import org.junit.Assert;
import org.junit.Test;

public class DeveloperFactoryTest {

    @Test
    public void buildTest_equals() {
        DeveloperFactory developerFactory = new DeveloperFactory();
        String[] array = {"A","A","22","2","1000","Java"};

        Developer actual = developerFactory.build(array);
        Developer expected = new Developer("A","A",22,2,1000, Languages.JAVA);

        Assert.assertEquals(expected,actual);
    }
}
