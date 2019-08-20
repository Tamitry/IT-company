package by.epam.javatraining.TarlikouskiDzmitri.task04.activity.factory;

/**
 * One of the factory elements.
 *
 * @author DzmitriyTarlikouski
 * date 16.08.2019
 * @version 1.0
 */

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Project_Manager;
import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee.Tester;
import by.epam.javatraining.TarlikouskiDzmitri.task04.exception.NotAvailableTypeOfEmployee;

public class ProjectManagerBuilder extends AbstactFactory{


    /**
     * Return new project manager with given parameters.
     *
     * @param str
     * @return
     */
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
