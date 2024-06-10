package oops;

public class EmployeeService{

  private static EmployeeService empService;

  private EmployeeService(){

  }

  public static EmployeeService getInstance(){
    if(empService == null){
      empService = new EmployeeService();
    }

    return empService;
  }

  public void printEmployees(List<Employee> employee){
    employee.forEach(employee ->System.out.println(Employee.toString()));
  }
}