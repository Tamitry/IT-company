package by.epam.TarlikovskiDzmitriy.task4.activity.factory;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory.EmployeeFactory;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Project_Manager;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Tester;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.TestType;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeFactoryTest {
    //String[] array = {"A", "A", "22", "2", "1200", };
    @Test
    public void buildTestDeveloper_equals(){
        String[] array = {"A", "A", "22", "2", "1200", "Java", "developer"};
        EmployeeFactory ef = new EmployeeFactory();
        Employee actual = ef.build(array);
        Employee expected = new Developer("A","A",22,2,1200, Languages.JAVA);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void buildTestTester_equals(){
        String[] array = {"A", "A", "22", "2", "1200", "Manual", "tester"};
        EmployeeFactory ef = new EmployeeFactory();
        Employee actual = ef.build(array);
        Tester expected = new Tester("A","A",22,2,1200, TestType.MANUAL);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void buildTestPM_equals(){
        String[] array = {"A", "A", "22", "2", "1200", "12", "project manager"};
        EmployeeFactory ef = new EmployeeFactory();
        Employee actual = ef.build(array);
        Employee expected = new Project_Manager("A","A",22,2,1200, 12);
        Assert.assertEquals(expected,actual);
    }
}
