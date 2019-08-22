package by.epam.TarlikovskiDzmitriy.task4.entity.employees;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Project_Manager;
import org.junit.Assert;
import org.junit.Test;

public class Project_ManagerTest {

    @Test
    public void pmTest() {
        Project_Manager actual = new Project_Manager("AAA", "AAAA", 19, 2, 1000,4);
        Project_Manager expected = new Project_Manager();
        expected.setAmOfPrevProject(4);
        expected.setExp(2);
        expected.setSalary(1000);
        expected.setAge(19);
        expected.setName("AAA");
        expected.setSurname("AAAA");

        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected.getAmOfPrevProject(),4);
    }
}
