package by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee;

/**
 * Class of analysts. There can be other methods, but now it just has
 * @author Dzmitri Tarlikovski
 * date 05.08.2019
 * @version  1.0
 */

public class Analyst extends Employee {

    String position;

    public Analyst(String name, String surname, Integer age, Integer exp, Integer salary) {

        super(name,surname,age,exp,salary);
        position="Analyst";

    }

    @Override
    public String toString() {
        return "Analyst "+super.toString();
    }

}
