package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators.SurnameComparator;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;

public class Main {


    public static void main(String []args) {
        Control control = new Control();
        TeamMembers teamMembers;

        teamMembers = control.collectTeam("./src/main/resources/Resourceы.txt");
        System.out.println(teamMembers.numberOfEmployees());
        System.out.println(SalarySumCounter.sumSalary(teamMembers));
        SortClass sortClass = new SortClass();
        sortClass.sortEmployees(new SurnameComparator(), teamMembers);
        System.out.println(teamMembers.toString());
    }
}
