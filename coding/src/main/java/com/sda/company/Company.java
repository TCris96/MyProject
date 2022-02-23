import java.util.ArrayList;

public class Company {
    public String name;
    public ArrayList<Employee> listOfEmployees;

    public Company() {

    }

    public Company(String name, ArrayList<Employee> listOfEmployees) {
        this.name = name;
        this.listOfEmployees = listOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(ArrayList<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }
}
