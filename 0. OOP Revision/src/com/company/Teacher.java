package com.company;

public class Teacher extends Employee {

    private String school;

    public Teacher(int notionalId, String firstName, String lastName, int age, String deprtment, double slalry, String school) {
        super(notionalId, firstName, lastName, age, deprtment, slalry);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String getFullName() {
        return "Teacher " + this.firstName + " " + this.lastName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "school='" + school + '\'' +
                ", notionalId=" + notionalId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", deprtment='" + deprtment + '\'' +
                '}';
    }
}
