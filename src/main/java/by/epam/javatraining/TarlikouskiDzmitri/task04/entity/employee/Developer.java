package by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee;

/**
 * Class of developers. There can be other methods, but now it just has
 * @author Dzmitri Tarlikovski
 * date 05.08.2019
 * @version  1.0
 */

public class Developer extends Employee {

    String position;

    public Developer(String name, String surname, Integer age, Integer exp, Integer salary) {

        super(name,surname,age,exp,salary);
        position = "Developer";

    }

    @Override
    public String toString() {
        return "Developer "+super.toString();
    }

}
