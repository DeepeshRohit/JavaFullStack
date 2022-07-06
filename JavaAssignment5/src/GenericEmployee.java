public class GenericEmployee <T1, T2 ,T3, T4>{

    T1 id;
    T2 name;
    T3 salary;
    T4 department;
	public GenericEmployee(T1 id, T2 name, T3 salary, T4 department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	
	public T1 getId() {
		return id;
	}


	public void setId(T1 id) {
		this.id = id;
	}


	public T2 getName() {
		return name;
	}


	public void setName(T2 name) {
		this.name = name;
	}


	public T3 getSalary() {
		return salary;
	}


	public void setSalary(T3 salary) {
		this.salary = salary;
	}


	public T4 getDepartment() {
		return department;
	}


	public void setDepartment(T4 department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "GenericEmployee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}


	public String displayDetails() {
		return "GenericEmployee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}


}