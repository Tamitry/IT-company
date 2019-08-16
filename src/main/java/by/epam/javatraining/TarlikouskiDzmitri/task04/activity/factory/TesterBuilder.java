package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Developer;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Tester;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.TestType;
import by.epam.javatraining.TarlikouskiDzmitri.task04.exception.NotAvailableTypeOfEmployee;

public class TesterBuilder extends AbstactFactory {

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
                        tester.setTestType(TestType.Manual);
                        break;
                    case "Autamatic":
                        tester.setTestType(TestType.Autamatic);
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
