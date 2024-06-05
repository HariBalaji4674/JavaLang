package oops;

public class OOP2 {
    public static void main(String[] args) {

        OOP2 obj = new OOP2();

        Human human = new Human(20,"peddirewddy",45000,true);
    }
    public int Simple(int number){
        return number;
    }
}
class Human{
    int age;
    String name;
    int salary;
    boolean married;

    public Human(int age,String name,int salary,boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        System.out.println(age+" "+name+" "+salary+" "+married);

    }

}
/*
// Lecture 2 OOPs Concepts
----------------------------
Packages, Static, SingleTon class,
Packages : Containers of Classes and Objects
- Just a Folder
- Packages for different functionalities

Static Methods /keywords:
--------------------------
Static Keyword: Common to all classes and methods.
- Static it can be used before creating other objects has been creating it will be stored in static memory
- without creating any object we can use this static method or variables
- Static methods,Static Variables
-


Public : will be available to another packages
Protected:
Private: Fixed to Only one package and methods




 */