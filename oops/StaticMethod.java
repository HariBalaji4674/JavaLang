package oops;

public class StaticMethod {

  public static void main(String[] args) {
    // method1();
    StaticMethod obj = new StaticMethod();
    obj.method2();
    // obj.test();


  }
  static void method1(){
    System.out.println("This is static method");
  }
  void method2(){
    method1();
    System.out.println("This is Non static method");
  }

  class test{
    static int a = m1();   // Initialize a static variable
    static {
      System.out.println("Inside Static Block");
    }
    static int m1(){
      System.out.println("From m1");
      return 20;

    }
  }

}
