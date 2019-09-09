package com.stackroute;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if(age<0 || age>100){
            dance();
        }else {
            this.age = age;
        }
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String dance(){
        return " Age not possible";
    }

    public boolean isValidAge(){
        int n = getAge();
        if(n>=18 && n<=60){
            return true;
        }else {
            return false;
        }
    }

    public String getFullName(){
        return firstName +" "+lastName;
    }
}
