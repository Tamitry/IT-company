package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;
import org.junit.Test;
import org.testng.Assert;

public class AgeComparatorTest {

    private AgeComparator ageComparator = new AgeComparator();

    @Test
    public void comparatorTestMore () {
        Employee e1 = new Employee("A","A",19,1,500);
        Employee e2 = new Employee("B","B",20,2,1500);


        Assert.assertTrue(ageComparator.compare(e1,e2)<0);
    }

    @Test
    public void comparatorTestEquals () {
        Employee e1 = new Employee("A","A",19,1,500);
        Employee e2 = new Employee("B","B",19,2,1500);


        Assert.assertTrue(ageComparator.compare(e1,e2)==0);
    }

    @Test
    public void comparatorTestLess () {
        Employee e1 = new Employee("A","A",19,1,500);
        Employee e2 = new Employee("B","B",20,2,1500);


        Assert.assertTrue(ageComparator.compare(e2,e1)<0);
    }
}
