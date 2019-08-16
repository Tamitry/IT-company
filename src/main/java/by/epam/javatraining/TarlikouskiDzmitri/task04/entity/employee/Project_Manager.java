package by.epam.javatraining.TarlikouskiDzmitri.task04.entity.employee;

/**
 * Class of project managers. There can be other methods, but now it just has
 * @author Dzmitri Tarlikovski
 * date 05.08.2019
 * @version  1.0
 */

public class Project_Manager extends Employee{

    int amOfPrevProject;

    public Project_Manager() {

    }

    public Project_Manager(String name, String surname, Integer age, Integer exp, Integer salary, int amOfPrevProject) {

        super(name,surname,age,exp,salary);
        this.amOfPrevProject=amOfPrevProject;

    }

    @Override
    public String toString() {
        return "Project manager "+super.toString()+", amount of previous project -"+amOfPrevProject;
    }

    @Override
    public int hashCode() {
        return getFullName().length()*10000000+getAge()*1000000+getSalary()*10000+getExp()+amOfPrevProject;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) {
            return true;
        }
        if(!(o instanceof Project_Manager)||o==null) {
            return false;
        }

        Project_Manager manager = (Project_Manager) o;
        if(getFullName().equals(manager.getFullName())&&getAge()==manager.getAge()&&getExp()==manager.getExp()&&
                getSalary()==manager.getSalary()&& amOfPrevProject ==manager.getAmOfPrevProject()) {
            return true;
        }

        return false;
    }

    public int getAmOfPrevProject() {
        return amOfPrevProject;
    }

    public void setAmOfPrevProject(int amOfPrevProject) {
        this.amOfPrevProject = amOfPrevProject;
    }

}
