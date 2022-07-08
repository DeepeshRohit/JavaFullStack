import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashSet<Employee> employees = new HashSet<>();

		    employees.add(new Employee(1,"Abhi","IT",3000));
	        employees.add(new Employee(2,"Gana","CyberSecurity",4000));
	        employees.add(new Employee(3,"Spin","HR",5000));
	        employees.add(new Employee(4,"Deep","Business",5000));
	        employees.add(new Employee(5,"Raaj","Finance",9000));
	        employees.add(new Employee(6,"pick","Accounts",4400));
	        List<Employee> list = employees.stream()
            .sorted(Comparator.comparing(
                    Employee::getName)) //comparator
            .collect(Collectors.toList()); //collector
	        
	        for(Employee e : list){
	            System.out.println(e);
	        }
	        }


}