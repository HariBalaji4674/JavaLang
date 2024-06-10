package oops;

import java.util.*;
import java.util.stream.Collectors;
import oops.Employee;

public class Main{

  public static List<Employee> getFifthHighestSalary(List<Employee> employees){
    // return employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(4).findFirst().orElseThrow(()-> new NoSuchElementException("No elements"));

    if(employees.size() < 5){

    }
    List<Double> uniqueSalries = employees.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder())
    .collect(Collectors.toList());

    if(uniqueSalries .size() < 5){
      System.out.print("Less sthan 5");
    }
    double fifthHighestSalary = uniqueSalries.get(4);
    return employees.stream().filter(employee -> employee.getSalary() == fifthHighestSalary).collect(Collectors.toList());
}

  public static void main(String[] args){
      List<Employee> employees = new ArrayList<>();

      employees.add(new Employee("Abc",120000));
      employees.add(new Employee("Abc",95000));
      employees.add(new Employee("Abc",85000));
      employees.add(new Employee("Aab",95000));
      employees.add(new Employee("Aaa",100000));
      employees.add(new Employee("Abb",75000));
      employees.add(new Employee("Bbb",60000));
      employees.add(new Employee("ACB",50000));

      EmployeeService service = EmployeeService.getInstance();

      List<Employee> fifthHighest = getFifthHighestSalary(employees);
      service.printEmployees(fifthHighest);


  }





}

