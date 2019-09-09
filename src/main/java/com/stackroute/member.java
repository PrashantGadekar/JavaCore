package com.stackroute;

public class member {
    public  String name;
    public int age;
    public double salary;
}

class member_variable{
    member obj = new member();
    public void set(String name, int age, double salary){
        this.obj.name = name;
        this.obj.age =age;
        this.obj.salary=salary;
    }

    public String[] display(){
        String[] str = new String[3];

        str[0] = "Members Name: "+ this.obj.name;
        str[1] = "Members Age: "+ this.obj.age;
        str[2] = "Members Salary: "+ this.obj.salary;

        return str;
    }

}


