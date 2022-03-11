package com.sda.task.oop.task2;

public class Lecture extends Person{
    private String specialization;
    private int salary;

    public Lecture(String specialization, int salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                "} " ;
    }
}
