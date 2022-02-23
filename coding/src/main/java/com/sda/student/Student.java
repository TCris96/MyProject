public class Student {
    public String name;
    public String surname;
    public int age;
    public int yearOfGraduation;
    public double average;

    public Student(){

    }
    public Student(String name, String surname, int age, int yearOfGraduation, int average){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.yearOfGraduation = yearOfGraduation;
        this.average = average;
    }


    @Override
    public String toString() {
        return "Student:" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", yearOfGraduation=" + yearOfGraduation +
                ", average=" + average +
                '}';
    }
}
