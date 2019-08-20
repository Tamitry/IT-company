package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory.AbstactFactory;
import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory.EmployeeFactory;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;

public class Control {

    private TakeListFromFile takeListFromFile;
    private EmployeeFactory employeeFactory;
    private TeamMembers teamMembers;

    public Control() {
        takeListFromFile = new TakeListFromFile();
        employeeFactory = new EmployeeFactory();
        teamMembers = new TeamMembers();
    }

    public TeamMembers collectTeam(String path) {

        ArrayList<String> str = takeListFromFile.importText(path);

        for(String line:str) {
            String[] employee=line.split(", ");
            String[] separateName=employee[0].split(" ");
            String[] newEmployee = new String[7];
            newEmployee[0]=separateName[0];
            newEmployee[1]=separateName[1];
            for(int i=1;i<6;i++) {
                newEmployee[i+1]=employee[i];
            }

            teamMembers.addEmpolyee(employeeFactory.build(newEmployee));
        }
        return teamMembers;

    }

}
