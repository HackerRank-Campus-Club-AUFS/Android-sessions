package com.company;

public  class Person {

    protected int notionalId;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String deprtment;

    public Person(int notionalId, String firstName, String lastName, int age, String deprtment) {
        this.notionalId = notionalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.deprtment = deprtment;
    }

    public int getNotionalId() {
        return notionalId;
    }

    public void setNotionalId(int notionalId) {
        this.notionalId = notionalId;
    }

    public String getFirstName() {
        return firstName;
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

    public int getAge() {
        return age;
    }

    public final void setAge(int age) {
        if(age>=0){
            this.age = age;
        }
    }

    public String getDeprtment() {
        return deprtment;
    }

    public void setDeprtment(String deprtment) {
        this.deprtment = deprtment;
    }


    public  String getFullName(){
        return this.firstName+" "+this.lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "notionalId=" + notionalId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", deprtment='" + deprtment + '\'' +
                '}';
    }
}
