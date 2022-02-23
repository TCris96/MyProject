import java.util.Scanner;

public class StudentTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numberOfStudents = scanner.nextInt();
        Student[] students = new Student[numberOfStudents];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            scanner.nextLine();
            System.out.println("Enter the student's name:");
            students[i].name = scanner.nextLine();
            System.out.println("Enter the student's surname:");
            students[i].surname = scanner.nextLine();
            System.out.println("Enter the student's age:");
            students[i].age = scanner.nextInt();
            System.out.println("Enter the student's year of graduation:");
            students[i].yearOfGraduation = scanner.nextInt();
            System.out.println("Enter the student's average:");
            students[i].average = scanner.nextDouble();
        }
        for (Student student : students) {
            System.out.println("Name: " + student.name + "/Surname: " + student.surname + "/Age: " + student.age
                    + "/Year of graduation: " + student.yearOfGraduation + "/Average: "
                    + student.average);
        }
        System.out.println("Enter the student's name you want to print:");
        printByTheName(students, scanner.next());

        double grade = 0;
        String name = "";

        for (Student student : students) {
            if (student.average > grade) {
                grade = student.average;
                name = student.name;
            }
        }
        System.out.println("The student with the greatest average is:");
        printByTheName(students, name);
        System.out.println("Enter the student's name who you want to verify if the year of graduation is " +
                "a leap year:");
        boolean isLeapYear = leapYear(students, scanner.next());
        if (isLeapYear) {
            System.out.println("The student's year of graduation is a leap year");
        } else {
            System.out.println("The student's year of graduation is not a leap year");
        }
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].yearOfGraduation > students[j].yearOfGraduation) {
                    Student tempStudent = new Student();
                    tempStudent = students[i];
                    students[i] = students[j];
                    students[j] = tempStudent;
                }
            }
        }

        for (Student student : students) {
            System.out.println("Name: " + student.name + "/Surname: " + student.surname + "/Age: " + student.age
                    + "/Year of graduation: " + student.yearOfGraduation + "/Average: "
                    + student.average);
        }


    }

    public static void printByTheName(Student[] students, String name) {
        for (Student student : students) {
            if (name.equalsIgnoreCase(student.name)) {
                System.out.println("Name:" + student.name + " / Surname:" + student.surname + " / Age:"
                        + student.age + "/Year of graduation: " + student.yearOfGraduation
                        + "/Average: " + student.average);
            } else {
                System.out.println("The student does not exist!");
            }
        }
    }

    public static boolean leapYear(Student[] students, String name) {
        for (Student student : students) {
            if (name.equalsIgnoreCase(student.name)) {
                if (student.yearOfGraduation % 4 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
