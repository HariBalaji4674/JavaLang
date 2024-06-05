package oops;

public class OOPSClass {
    public static void main(String[] args) {

        Integer numberObj = 45;
        System.out.println(numberObj);

        student std = new student();

        System.out.println(std.number);
        System.out.println(std.string);
        System.out.println(std.marks);

        final int number = 20;
//        number = 40;    final keyword cannot be modified
        System.out.println(number);

//        int age = Integer.parseInt("20");
        int age = 20;

        char c = (char)(age);
        System.out.println(c);
    }
}
class student{
    int number;
    String string;
    float marks ;
    student (int number, String string, float marks) {
        this.number = number;
        this.string = string;
        this.marks = marks;
    }
    student() {
        this (34,"hari vardhan",45.5f);
    }
}


/*

Class
Object

CONSTRUCTOR:
- when we are building an object pass all these values
- This is called constructor
- Constructor is a special function that runs when you create an object
- bind these arguments with the object
- Constructor can call other constructor as well

This Keyword:
- This keyword will be added when you will be calling own clas methods and properties
- this will be used in own class
- super will be used in parent class

- why we don't use new keyword for primitive data type
- the datatypes are stored in the heap memory
- to make fast programming
- allocated memory at run time

two reference variables are assigned to same object
any changes made via reference can made other reference changes

Wrapper Classes:
- it will create object for this
- converting a character into an object

Java is Pass by value language

Final Keyword(Modifier):
- Keyword used when you want to prevent from modifications
- it cannot be modified
- Final Variable must be initialized
- because we cant change it in future
- you cannot make any changes
- when a primitive data is fina we cannot modify it

When particular object is not referenced by any other object then garbage collector will hit that and remove that

finalizer method will be called when java is doing garbage collector





 */