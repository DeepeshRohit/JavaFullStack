import java.util.HashSet;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashSet<GenericEmployee<Integer, String, Integer, String>> employees = new HashSet<>();

	        employees.add(new GenericEmployee<Integer, String, Integer, String>(1,"Deep",3000,"IT"));
	        employees.add(new GenericEmployee<Integer, String, Integer, String>(2,"Ajay",4000,"CyberSecurity"));
	        employees.add(new GenericEmployee<Integer, String, Integer, String>(3,"Preet",5000,"HR"));
	        employees.add(new GenericEmployee<Integer, String, Integer, String>(4,"Sidhu",5000,"Business"));
	        employees.add(new GenericEmployee<Integer, String, Integer, String>(5,"Aman",9000,"Finance"));
	        employees.add(new GenericEmployee<Integer, String, Integer, String>(6,"Sandy",4400,"Accounts"));

	        for(GenericEmployee<Integer, String, Integer, String> e : employees){
	            System.out.println(e.displayDetails());
	        }
	}

}
