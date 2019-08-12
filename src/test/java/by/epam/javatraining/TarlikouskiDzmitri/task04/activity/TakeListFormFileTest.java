package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;
/**
 * Я не смог  =((((
 */

import org.junit.Test;

public class TakeListFormFileTest {

    TakeListFromFile takeListFromFile = new TakeListFromFile();

    @Test
    public void importTest() {
        takeListFromFile.importText("src/test/resource/date.txt");

    }
}
