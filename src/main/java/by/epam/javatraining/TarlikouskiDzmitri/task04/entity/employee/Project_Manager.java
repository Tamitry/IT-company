package by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee;

/**
 * Class of project managers. There can be other methods, but now it just has
 * @author Dzmitri Tarlikovski
 * date 05.08.2019
 * @version  1.0
 */

public class Project_Manager extends Employee{

    String position;

    public Project_Manager(String name, String surname, Integer age, Integer exp, Integer salary) {

        super(name,surname,age,exp,salary);
        position = "Project manager";

    }

    @Override
    public String toString() {
        return "Project manager "+super.toString();
    }

}
