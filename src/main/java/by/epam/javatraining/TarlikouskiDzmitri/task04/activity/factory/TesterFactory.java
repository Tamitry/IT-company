package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory;

/**
 * One of the factory elements.
 *
 * @author DzmitriyTarlikouski
 * date 16.08.2019
 * @version 1.0
 */

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Tester;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.TestType;
import by.epam.javatraining.TarlikouskiDzmitri.task04.exception.NotAvailableTypeOfEmployee;

public class TesterFactory extends AbstactFactory {


    /**
     * Return new tester with given parameters.
     *
     * @param str
     * @return
     */
    @Override
    public Tester build(String[] str){

        Tester tester = new Tester();
        fill(str,tester);
        setTestsType(str,tester);

        return tester;
    }

    private void setTestsType(String[] str, Tester tester) {

        try {
                switch (str[5]) {
                    case "Manual":
                        tester.setTestType(TestType.MANUAL);
                        break;
                    case "Automatic":
                        tester.setTestType(TestType.AUTOMATIC);
                        break;
                    default:
                        throw new NotAvailableTypeOfEmployee("Incorrect test type.");
                }
        }
        catch (NotAvailableTypeOfEmployee ex) {
            System.out.println(ex.getMessage());
        }
    }
}
