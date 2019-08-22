package by.epam.TarlikovskiDzmitriy.task4.entity.employees;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import org.junit.Assert;
import org.junit.Test;

public class DeveloperTest {

    @Test
    public void developersTest_equals() {
        Developer actual = new Developer("AAA","AAAA",19,2,1000, Languages.JAVA);
        Developer expected = new Developer();
        expected.setLanguage(Languages.JAVA);
        expected.setExp(2);
        expected.setSalary(1000);
        expected.setAge(19);
        expected.setName("AAA");
        expected.setSurname("AAAA");

        Assert.assertEquals(expected,actual);
        Assert.assertEquals(Languages.JAVA,expected.getLanguage());
        Assert.assertEquals(expected.getAge(),19);
        Assert.assertEquals(expected.getSalary(),1000);
        Assert.assertEquals(expected.getExp(),2);
        Assert.assertEquals(expected.getName(),"AAA");
        Assert.assertEquals(expected.getFullName(),"AAA AAAA");
    }

}
