package by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee;

/**
 * Class of visers. There can be other methods.
 *
 * @author Dzmitri Tarlikovski
 * date 05.08.2019
 * @version  1.0
 */

public class Viser extends Employee {

    String position;

    public Viser(String name, String surname, Integer age, Integer exp, Integer salary) {

        super(name,surname,age,exp,salary);
        position = "Viser";

    }

    @Override
    public String toString() {
        return "Viser "+super.toString();
    }
}
