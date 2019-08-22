package by.epam.TarlikovskiDzmitriy.task4.validation;

import by.epam.javatraining.TarlikouskiDzmitri.task04.validation.Validator;
import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {

    @Test
    public void validateTest_true() {
        Validator validator = new Validator();
        Assert.assertTrue(validator.validate("Aaaa AAaaa, 19, 1, 1200, 12, project manager"));
    }

    @Test
    public void validateTest_false() {
        Validator validator = new Validator();
        Assert.assertFalse(validator.validate("Aaaa AAaaa, 19, 1, 1200, 12, projedsct manager"));
    }
}
