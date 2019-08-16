package by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee;

import by.epam.javatraining.TarlikouskiDzmitri.task04.entity.enums.Languages;

/**
 * Class of developers. There can be other methods, but now it just has
 * @author Dzmitri Tarlikovski
 * date 05.08.2019
 * @version  1.0
 */

public class Developer extends Employee {

    private Languages language;

    public Developer() {

    }

    public Developer(String name, String surname, Integer age, Integer exp, Integer salary, Languages lang) {

        super(name,surname,age,exp,salary);
        language = lang;

    }

    @Override
    public String toString() {
        return "Developer:"+super.toString() + "language -" + language + ".";
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) {
            return true;
        }
        if(!(o instanceof Developer)||o==null) {
            return false;
        }

        Developer dev = (Developer) o;
        if(getFullName().equals(dev.getFullName())&&getAge()==dev.getAge()&&getExp()==dev.getExp()&&
                getSalary()==dev.getSalary()&& language ==dev.getLanguage()) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {

        switch (language) {
            case C:
                return getFullName().length()*100000+getAge()*10000+getSalary()*100+getExp()*10+2;
            case Java:
                return getFullName().length()*100000+getAge()*10000+getSalary()*100+getExp()*10+5;
            case Python:
                return getFullName().length()*100000+getAge()*10000+getSalary()*100+getExp()*10+8;
            default:
                return getFullName().length()*100000+getAge()*10000+getSalary()*100+getExp()*10;
        }
    }

    public Languages getLanguage() {
        return language;
    }

    public void setLanguage(Languages language) {
        this.language = language;
    }

}
