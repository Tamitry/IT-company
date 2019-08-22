package by.epam.TarlikovskiDzmitriy.task4.activity.factory;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory.TesterFactory;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Tester;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.TestType;
import org.junit.Assert;
import org.junit.Test;

public class TesterFactoryTest {

    @Test
    public void buildTest_equals() {
        TesterFactory testerFactory = new TesterFactory();
        String[] array = {"A","A","22","2","1000","Manual"};
        Tester actual = testerFactory.build(array);
        Tester expected = new Tester("A","A",22,2,1000, TestType.MANUAL);

        Assert.assertEquals(expected,actual);
    }
}
