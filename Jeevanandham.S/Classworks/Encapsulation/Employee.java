package Encapsulation;
class Employee{
	private int emp_id;
	private String emp_name;
	private long emp_salary;

	Employee(int emp_id, String emp_name, long emp_salary){
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	public void setEmpId(int id){
		emp_id = id;
	}
	public int getEmpId(){
		return emp_id;
	}

	public void setEmpName(String name){
		emp_name = name;
	}
	public String getEmpName(){
		return emp_name;
	}

	public void setEmpSalary(long sal){
		emp_salary = sal;
	}
	public long getEmpSalary(){
		return emp_salary;
	}

	public String toString(){
		return emp_id+" "+emp_name+" "+emp_salary;
	}

	public void getDetails(Employee e){
		System.out.println(e);
	}
}