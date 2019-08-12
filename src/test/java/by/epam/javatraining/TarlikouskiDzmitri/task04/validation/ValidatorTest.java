package by.epam.javatraining.TarlikouskiDzmitri.task04.validation;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {
    Validator validator = new Validator();

    String first = "A Asde 15 1 1222";
    String second = "Asaa A 15 1 1222";
    String third = "aasas asd 10 1 1222";
    String fourth = "Asdasd awq 18 -1 1234";
    String fifth = "asdsa assq 18 3 100000";

    @Test
    public void validTestFirst() {
        Assert.assertFalse(validator.validate(first));
    }

    @Test
    public void validTestSecond() {
        Assert.assertFalse(validator.validate(second));
    }

    @Test
    public void validTestThird() {
        Assert.assertFalse(validator.validate(third));
    }

    @Test
    public void validTestFourth() {
        Assert.assertFalse(validator.validate(fourth));
    }

    @Test
    public void validTestFifth() {
        Assert.assertFalse(validator.validate(fifth));
    }
}
