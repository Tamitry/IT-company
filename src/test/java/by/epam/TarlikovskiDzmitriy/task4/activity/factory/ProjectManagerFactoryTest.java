package by.epam.TarlikovskiDzmitriy.task4.activity.factory;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory.ProjectManagerFactory;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Project_Manager;
import org.junit.Assert;
import org.junit.Test;

public class ProjectManagerFactoryTest {

    @Test
    public void buildTest_equals() {
        ProjectManagerFactory pf = new ProjectManagerFactory();
        String[] array = {"A","A","32","2","1200","12"};
        Project_Manager actual = pf.build(array);
        Project_Manager expected = new Project_Manager("A","A",32,2,1200,12);

        Assert.assertEquals(expected,actual);
    }
}
