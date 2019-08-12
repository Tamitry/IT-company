package by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee;

/**
 * Class of testers. There can be other methods, but now it just has
 * @author Dzmitri Tarlikovski
 * date 05.08.2019
 * @version  1.0
 */

public class Tester extends Employee {

    String position;

    public Tester(String name, String surname, Integer age, Integer exp, Integer salary) {

        super(name,surname,age,exp,salary);
        position = "Tester";

    }

    @Override
    public String toString() {
        return "Tester "+super.toString();
    }

}
