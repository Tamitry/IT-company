package by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.TestType;

/**
 * Class of testers. There can be other methods, but now it just has a new field.
 *
 * @author Dzmitri Tarlikovski
 * date 05.08.2019
 * @version  1.0
 */

public class Tester extends Employee {

    private TestType testType;

    public Tester() {

    }

    public Tester(String name, String surname, Integer age, Integer exp, Integer salary, TestType testType) {

        super(name,surname,age,exp,salary);
        this.testType=testType;

    }

    @Override
    public String toString() {
        return "Tester "+super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) {
            return true;
        }
        if(!(o instanceof Tester)||o==null) {
            return false;
        }

        Tester tester = (Tester) o;
        if(getFullName().equals(tester.getFullName())&&getAge()==tester.getAge()&&getExp()==tester.getExp()&&
                getSalary()==tester.getSalary()&& testType ==tester.getTestType()) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {

        switch (testType) {
            case MANUAL:
                return getFullName().length() * 100000 + getAge() * 10000 + getSalary() * 100 + getExp() * 10 + 2;
            case AUTOMATIC:
                return getFullName().length() * 100000 + getAge() * 10000 + getSalary() * 100 + getExp() * 10 + 5;
            default:
                return getFullName().length() * 100000 + getAge() * 10000 + getSalary() * 100 + getExp() * 10;
        }
    }

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }
}
