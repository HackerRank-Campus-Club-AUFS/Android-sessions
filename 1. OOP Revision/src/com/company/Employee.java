package com.company;

public class Employee extends Person{
    /**
     * Data Fields
     * Data Valus
     * Attributes
     */
    private double slalry;


//    Contsructor
    public Employee(int notionalId, String firstName, String lastName, int age, String deprtment,double slalry) {
        super(notionalId,firstName,lastName,age,deprtment);
        this.slalry=slalry;
    }

    /**
     * Getter & Setter
     */

    public double getSlalry() {
        return slalry;
    }

    public void setSlalry(double slalry) {
        this.slalry = slalry;
    }

    @Override
    public String getFullName(){
        return "Employee "+super.getFullName();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "slalry=" + slalry +
                ", notionalId=" + notionalId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", deprtment='" + deprtment + '\'' +
                '}';
    }
}
