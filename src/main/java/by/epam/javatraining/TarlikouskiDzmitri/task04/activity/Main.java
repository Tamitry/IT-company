package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators.NameComparator;
import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators.SalaryComparator;
import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators.SurnameComparator;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;
import com.sun.deploy.util.ArrayUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.regex.*;

public class Main {
    public static void main(String []args) {
        Control control = new Control();
        TeamMembers teamMembers;

        teamMembers = control.collectTeam("./src/main/resources/Resource.txt");
        System.out.println(teamMembers.numberOfEmployees());
        System.out.println(SalarySumCounter.sumSalary(teamMembers));
        SortClass sortClass = new SortClass();
        sortClass.sortEmployees(new SurnameComparator(), teamMembers);
        System.out.println(teamMembers.toString());
    }
}
