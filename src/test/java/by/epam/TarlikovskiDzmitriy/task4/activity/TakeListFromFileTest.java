package by.epam.TarlikovskiDzmitriy.task4.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.TakeListFromFile;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TakeListFromFileTest {

    @Test
    public void importTextTest_equals() {
        TakeListFromFile takeListFromFile=new TakeListFromFile();

        ArrayList<String> actualText = takeListFromFile.importText("./src/test/resource/Resource.txt");
        ArrayList<String> expectedText= new ArrayList<>();
        expectedText.add("Aleksei Ewart, 24, 3, 1000, Manual, tester");
        expectedText.add("Ivan Dayan, 21, 1, 1100, Automatic, tester");
        expectedText.add("Nicholas Watson, 30, 6, 600, Automatic, tester");

        Assert.assertEquals(expectedText,actualText);

    }
}
