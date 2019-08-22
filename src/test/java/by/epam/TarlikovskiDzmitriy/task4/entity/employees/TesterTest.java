package by.epam.TarlikovskiDzmitriy.task4.entity.employees;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Tester;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.TestType;
import org.junit.Assert;
import org.junit.Test;

public class TesterTest {

    @Test
    public void testerTest_equals() {
        Tester actual = new Tester("AAA","AAAA",19,2,1000, TestType.AUTOMATIC);
        Tester expected = new Tester();
        expected.setExp(2);
        expected.setSalary(1000);
        expected.setAge(19);
        expected.setName("AAA");
        expected.setSurname("AAAA");
        expected.setTestType(TestType.AUTOMATIC);

        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected.getTestType(),TestType.AUTOMATIC);
    }
}
