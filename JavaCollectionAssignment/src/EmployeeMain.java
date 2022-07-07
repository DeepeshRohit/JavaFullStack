import java.util.HashSet;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashSet<Employee> employees = new HashSet<>();

		    employees.add(new Employee(1,"abcd","IT",3000));
	        employees.add(new Employee(2,"efgh","CyberSecurity",4000));
	        employees.add(new Employee(3,"ijjk","HR",5000));
	        employees.add(new Employee(4,"lmno","Business",5000));
	        employees.add(new Employee(5,"pqrst","Finance",9000));
	        employees.add(new Employee(6,"uvwx","Accounts",4400));
	        
	        for(Employee e : employees){
	            System.out.println(e.displayDetails());
	        }
	        }


}