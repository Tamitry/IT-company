package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Project_Manager;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Tester;
import by.epam.javatraining.TarlikouskiDzmitri.task04.exception.NotAvailableTypeOfEmployee;

public class ProjectManagerBuilder extends AbstactFactory{

    @Override
    public Project_Manager build(String[] str) {

        Project_Manager pm = new Project_Manager();
        fill(str,pm);
        try {
            try {
                pm.setAmOfPrevProject(Integer.parseInt(str[5]));
            } catch (NumberFormatException ex) {
                throw new NotAvailableTypeOfEmployee("Wrong type of number of manager's projects.");
            }
        }
        catch (NotAvailableTypeOfEmployee ex) {
            System.out.println(ex.getMessage());
        }
        return pm;
    }
}
