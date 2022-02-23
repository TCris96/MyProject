import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainCompanyEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Company myCompany = new Company();
        myCompany.setName("Oracle");
        ArrayList<Employee> listOfEmployees = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Employee x = new Employee();
            System.out.println("Enter the " + i + " employee's name:");
            x.setFirstName(scanner.nextLine());
            System.out.println("Enter the " + i + " employee's surname: ");
            x.setLastName(scanner.nextLine());
            System.out.println("Enter the " + i + " employee's age:");
            x.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Enter the " + i + " employee's date of birth: dd-MM-yyyy");
            String date = scanner.nextLine();
            LocalDate birthday = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            x.setDateOfBirth(birthday);
            System.out.println("Enter the " + i + " employee's salary:");
            x.setSalary(scanner.nextDouble());
            scanner.nextLine();
            listOfEmployees.add(x);
        }
        myCompany.setListOfEmployees(listOfEmployees);
        double sum = 0;
        for (Employee x : listOfEmployees) {
            System.out.println(x.toString());
            sum += x.getSalary();
        }
        System.out.println("The average of the employee's salaries is: " + (sum / 5));
        Collections.sort(listOfEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        });
        for (Employee x : listOfEmployees) {
            System.out.println(x.toString());

        }


    }
}
