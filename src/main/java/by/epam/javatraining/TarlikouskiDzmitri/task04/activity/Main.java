package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.regex.*;

public class Main {
    public static void main(String []args) {
        Control control = new Control();
        TeamMembers teamMembers;

        teamMembers = control.collectTeam("./src/main/resources/Resource.txt");
        System.out.println(teamMembers.numberOfEmployees());
    }
}
