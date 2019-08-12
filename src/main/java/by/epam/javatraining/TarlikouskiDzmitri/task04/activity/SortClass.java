package by.epam.javatraining.TarlikouskiDzmitri.task04.activity;

/**
 * Bubble sorts for various parameters.
 *
 * @author Dzmitri Tarlikovski
 * @date 12.08.2019
 * @version  1.0
 */

import by.epam.javatraining.TarlikouskiDzmitri.task04.activity.comparators.*;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.department.TeamMembers;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Employee;

public class SortClass {

    private AgeComparator ageComparator;
    private ExperienceComparator experienceComparator;
    private NameComparator nameComparator;
    private SalaryComparator salaryComparator;
    private SurnameComparator surnameComparator;

    public SortClass() {

        ageComparator = new AgeComparator();
        experienceComparator = new ExperienceComparator();
        nameComparator = new NameComparator();
        salaryComparator = new SalaryComparator();
        surnameComparator = new SurnameComparator();

    }

    public void sortSurname(TeamMembers teamMembers) {

        int size = teamMembers.numberOfEmployees();

        for(int i=0;i<size-1;i++) {
            for(int j=i+1;j<size;j++) {
                if(surnameComparator.compare(teamMembers.getEmployee(j-1),teamMembers.getEmployee(j))>1) {
                    Employee temp = teamMembers.getEmployee(j-1);
                    teamMembers.setEmployees(j-1, teamMembers.getEmployee(j));
                    teamMembers.setEmployees(j,temp);
                }
            }
        }
    }

    public void sortAge(TeamMembers teamMembers) {

        int size = teamMembers.numberOfEmployees();

        for(int i=0;i<size-1;i++) {
            for(int j=i+1;j<size;j++) {
                if(ageComparator.compare(teamMembers.getEmployee(j-1),teamMembers.getEmployee(j))>1) {
                    Employee temp = teamMembers.getEmployee(j-1);
                    teamMembers.setEmployees(j-1, teamMembers.getEmployee(j));
                    teamMembers.setEmployees(j,temp);
                }
            }
        }
    }

    public void sortSalary(TeamMembers teamMembers) {

        int size = teamMembers.numberOfEmployees();

        for(int i=0;i<size-1;i++) {
            for(int j=i+1;j<size;j++) {
                if(salaryComparator.compare(teamMembers.getEmployee(j-1),teamMembers.getEmployee(j))>1) {
                    Employee temp = teamMembers.getEmployee(j-1);
                    teamMembers.setEmployees(j-1, teamMembers.getEmployee(j));
                    teamMembers.setEmployees(j,temp);
                }
            }
        }
    }

    public void sortExperience(TeamMembers teamMembers) {

        int size = teamMembers.numberOfEmployees();

        for(int i=0;i<size-1;i++) {
            for(int j=i+1;j<size;j++) {
                if(experienceComparator.compare(teamMembers.getEmployee(j-1),teamMembers.getEmployee(j))>1) {
                    Employee temp = teamMembers.getEmployee(j-1);
                    teamMembers.setEmployees(j-1, teamMembers.getEmployee(j));
                    teamMembers.setEmployees(j,temp);
                }
            }
        }
    }

    public void sortName(TeamMembers teamMembers) {

        int size = teamMembers.numberOfEmployees();

        for(int i=0;i<size-1;i++) {
            for(int j=i+1;j<size;j++) {
                if(nameComparator.compare(teamMembers.getEmployee(j-1),teamMembers.getEmployee(j))>1) {
                    Employee temp = teamMembers.getEmployee(j-1);
                    teamMembers.setEmployees(j-1, teamMembers.getEmployee(j));
                    teamMembers.setEmployees(j,temp);
                }
            }
        }
    }
}
