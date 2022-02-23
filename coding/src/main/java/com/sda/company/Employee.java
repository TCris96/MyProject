import java.time.LocalDate;

public class Employee {
    public String firstName;
    public String lastName;
    public int age;
    public LocalDate dateOfBirth;
    public double salary;

    public Employee() {

    }
    public Employee(String firstName, String lastName, int age, LocalDate dateOfBirth, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", age: " + age +
                ", dateOfBirth: " + dateOfBirth +
                ", salary: " + salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
