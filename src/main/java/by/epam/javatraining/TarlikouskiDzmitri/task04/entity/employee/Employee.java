package by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee;

/**
 * General class of employees containing basic fields and methods.
 * @author Dzmitri Tarlikovski
 * date 05.08.2019
 * @version  1.0
 */

public abstract class Employee extends Human {

    int exp;     //work expirience in years
    int salary;  //man hours salary in dollars

    public Employee() {

    }

    public Employee(String name, String surname, Integer age, Integer exp, Integer salary) {

        super(name,surname,age);
        this.exp=exp;
        this.salary=salary;

    }

    public int getExp() {

        return exp;

    }

    public void setExp(Integer exp) {

        this.exp = exp;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        return " : full name - "+getFullName()+", age - "+getAge()+", experience - "+exp+", salary -"+salary+", ";

    }

}
