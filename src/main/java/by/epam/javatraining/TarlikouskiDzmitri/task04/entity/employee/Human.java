package by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee;

/**
 * General class of humans containing basic fields and methods.
 * @author Dzmitri Tarlikovski
 * date 05.08.2019
 * @version  1.0
 */

public abstract class Human {

    private String name;
    private String surname;
    private int age;

    public Human() {

    }

    public Human (String name, String surname, Integer age) {

        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Human named "+name+" "+surname+", "+age+" years old.";
    }

    @Override
    public int hashCode() {
        return name.length()*10000+surname.length()*100+age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) {
            return true;
        }
        if(!(obj instanceof Human)||obj==null) {
            return false;
        }

        Human human = (Human)obj;
        if(this.name.equals(human.getName())&&this.surname.equals(human.getSurname())&&this.age==human.getAge()) {
            return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFullName() {
        return name+" "+surname;
    }
}
