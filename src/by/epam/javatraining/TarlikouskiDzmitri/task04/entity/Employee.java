package by.epam.javatraining.TarlikouskiDzmitri.task04.entity;

/**
 * General class of employees containing basic fields and methods.
 * @author Dzmitri Tarlikovski
 * @date 05.08.2019
 * @version  1.0
 */

public class Employee extends Human{

    int exp;     //work expirience in years
    int salary;  //man hours salary in dollars

    public Employee(String name, String surname, int age, int exp, int salary) {

        super(name,surname,age);
        this.exp=exp;
        this.salary=salary;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee : full name - "+getFullName()+", age - "+getAge()+", experience - "+exp+", salary -"+salary;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) {
            return true;
        }
        if(!(o instanceof Employee)||o==null) {
            return false;
        }

        Employee employee = (Employee)o;
        if(getFullName().equals(employee.getFullName())&&getAge()==employee.getAge()&&getExp()==employee.getExp()&&
        getSalary()==employee.getSalary()) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return getFullName().length()*100000+getAge()*10000+getSalary()*10+getExp();
    }
}
